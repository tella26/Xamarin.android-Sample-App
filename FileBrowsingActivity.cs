using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Java.IO;
using Java.Util;

namespace XamarinSampleApp
{
    [Activity(Label = "RevTwo")]
    public class FileBrowsingActivity : Activity
    {
        private List<String> fileNames;
        private String[] excludedFiles = new String[] { "revtwo", "revtwo-journal" };
        ArrayAdapter<String> lstAdapter;

        ListView firstAppFiles;
        TextView emptyListViewText;
        Toolbar myToolbar;
        TextView txtThirdButton;
        TextView title;
        LinearLayout back;
        TextView back_text;

        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);
            SetContentView(Resource.Layout.activity_file_browsing);

            // Create your application here
            emptyListViewText = FindViewById<TextView>(Resource.Id.emptyX);
            firstAppFiles = FindViewById<ListView>(Resource.Id.firstAppFilesX);
            title = FindViewById<TextView>(Resource.Id.title);
            back = FindViewById<LinearLayout>(Resource.Id.back);
            back_text = FindViewById<TextView>(Resource.Id.back_text);


            firstAppFiles.EmptyView = emptyListViewText;
            refreshFileList();

            back_text.SetText(Resource.String.tutorials);
            back.Click += delegate {
                OnBackPressed();
            };
        }

        private void refreshFileList()
        {
            fileNames = new List<String>();
            this.getFilesFromStorages(FilesDir.Parent);
            lstAdapter = new ArrayAdapter<String>(this, Resource.Layout.list_menu_item, Resource.Id.txtMenuItem, fileNames.ToArray());
            firstAppFiles.Adapter = lstAdapter;
        }

        private void getFilesFromStorages(String path)
        {
            File file = new File(path);
            String[] parentList = file.List();
            if (parentList != null)
            {
                foreach (File f in file.ListFiles())
                {
                    if (f.IsDirectory)
                    {
                        this.getFilesFromStorages(f.AbsolutePath);
                    }
                    else if (shouldIncludeFile(f.Name))
                    {
                        fileNames.Add(getPath(f.AbsolutePath));
                    }
                }
            }
        }
        private String getPath(String fullPath)
        {
            return fullPath.Split(new string[] { PackageName + "/" }, StringSplitOptions.None)[1];
        }

        private bool shouldIncludeFile(String filename)
        {
            return !fileNames.Contains(filename);
            Arrays.AsList(excludedFiles).Contains(filename);
        }
    }
}