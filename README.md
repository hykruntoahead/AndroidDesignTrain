# AndroidDesignTrain
AndroidDesign 一些控件的使用

CoordinatorLayout  :
1、app:layout_scrollFlags （子布局设置是否可滑动）  
2、android:layout_gravity 属性控制组件在布局中的位置  
3、app:layout_behavior="@string/appbar_scrolling_view_behavior" 通知布局中包含滑动组件！  
4、app:layout_scrollFlags是一个重要的属性  子布局通过此确定是否可滑动.
给需要滑动的组件设置app:layout_scrollFlags="scroll|enterAlways"属性。
设置的layout_scrollFlags有如下几种选项：      
(1) scroll: 所有想滚动出屏幕的view都需要设置这个flag- 没有设置这个flag的view将被固定在屏幕顶部。    
(2)enterAlways:这个flag让任意向下的滚动都会导致该view变为可见，启用快速“返回模式”。      
(3)enterAlwaysCollapsed:当你的视图已经设置minHeight属性又使用此标志时，你的视图只能已最小高度进入，只有当滚动视图到达顶部时才扩大到完整高度。    
(4)exitUntilCollapsed: 滚动退出屏幕，最后折叠在顶端。  
5、CollapsingToolbarLayout        
      （1）app:collapsedTitleGravity 指定折叠状态的标题如何放置，可选值:top、bottom等        
      （2）app:collapsedTitleTextAppearance="@style/TextAppearance.CollapsedTitle"指定折叠状态标题文字的样貌        
      （3）app:expandedTitleTextAppearance="@style/TextAppearance.ExpandedTitle"指定展开状态标题文字的样貌        
      （4）app:contentScrim="?attr/colorPrimaryDark"指定CollapsingToolbarLayout完全被滚出到屏幕外时的ColorDrawable        
      （5）app:expandedTitleGravity  展开状态的标题如何放置        
      （6）app:titleEnabled指定是否显示标题文本        
      （7）app:toolbarId指定与之关联的ToolBar，如果未指定则默认使用第一个被发现的ToolBar子View        
      （8）app:expandedTitleMarginStart="10dp"        
      （9）app:expandedTitleMargin        
      （10）app:expandedTitleMarginBottom        
      （11）app:expandedTitleMarginEnd 展开状态改变标题文字的位置，通过margin设置        
      （12）app:layout_collapseParallaxMultiplier="0.7" 设置视差的系数，介于0.0-1.0之间。        
      （13）app:layout_collapseMode="pin"（子布局设置折叠模式）有两种“pin”：
            固定模式，在折叠的时候最后固定在顶端；“parallax”：视差模式，在折叠的时候会有个视差折叠的效果。     
 6、CollapsingToolbarLayout主要是提供一个可折叠的Toolbar容器，对容器中的不同View设置layout_collapseMode折叠模式，来达到不同的折叠效果。  
 7、Floating Action Button (FAB)       
      （1）app:fabSize="normal" 是用来定义 FAB 的大小的，normal 的意思是在大多数情况下标准尺寸为 56dp 的按钮，但是万一你想使用较小的  
      一个， mini 是另一个选择，它的大小将变成 40dp。      
      （2）app:elevation 　　为空闲状态下的阴影深度，      
      （3）app:pressedTranslationZ　　 为按下状态的。      
      （4）app:backgroundTint 　　是指定默认的背景颜色       
      （5）app:rippleColor 　　是指定点击时的背景颜色       
      （6）app:border 　　 Width 　border的宽度       
      （7）app:fabSize 　　是指FloatingActionButton的大小，可选normal|mini       
      （8）app:pressedTranslationZ  　　按下去时的z轴的便宜     
   8、TabLayout  
      （1）app:tabIndicatorColor  　　tab的指示符颜色   
      （2）app:tabSelectedTextColor  　　选择tab的文本颜色   
      （3）app:tabTextColor  　　普通tab字体颜色   
      （4）app:tabMode  　　模式，可选fixed和scrollable fixed是指固定个数，scrollable是可以横行滚动  
      （5）app:tabGravity  对齐方式，可选fill和center
