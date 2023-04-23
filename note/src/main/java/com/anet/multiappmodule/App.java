package com.anet.multiappmodule;

import com.anet.common.App_parent;


    public class App extends App_parent {


        @Override
        public void onCreate() {
            super.onCreate();
            statsClass = Activity_Stats.class;
        }

    }

