   M S B A M L   `   `   `  ����B  >ChatBot, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null!clr-namespace:ChatBotChatBot  5   	       ChatBot.Chat   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   'localclr-namespace:ChatBot     5   	   U QMaterialDesignThemes.Wpf, Version=2.6.0.325, Culture=neutral, PublicKeyToken=nullFmaterialDesign1http://materialdesigninxaml.net/winfx/xaml/themes  5   	   $	��600��5	   	   $
��1080��6     � 
ResizeMode$  NoResize=�6#    � WindowStartupLocation$ CenterScreen=�5
   	    � WindowStyle$
 None=�6.   $��Dosis)�6A   .��5      �  � ColumnDefinitions 5   
   �� 5      $	��270 �6   �� 5      $��* �6   �� 5      $	��270 �6   .+�5   
   � ���	#FF272727$��2��6&   .+�5      ��  �� Orientation$ 
Horizontal=�6   $	��100��62   $	��Top=�6?   
���   � J� Effect 5      3  -System.Windows.Media.Effects.DropShadowEffect  5         
BlurRadius$ 30Q�6'      ShadowDepth$ 1Q�67   .+�5      �� $��10��6   $��10��6$   $��Right=�60   $��15q�6L   
��� � � �� CornerRadius$ 15��6k   $��Center=�6}   �� 5      $��Rouru��6   $��28(�6)   $��Center=�67   
�������6R   5      �� 5      $��0 100q�6   $��Bottom=�6(   5      �� 5      ���	#FF151515$��Bottom=�6,   ._�5      � $
��0 10q�6    5      �� 5       $��* �6+   �� 5!      $��70 �6+   �� 5"      $��70 �6+   �� 5#      $��70 �6+   .+�5%      �� -   5        	 ��Name$	 mensagem��5%      $��0��60   $��80��6@   
 �� TextWrapping$

 Wrap=�6O   $��5q�6c    �� AcceptsReturn . " �� VerticalScrollBarVisibility$
 Auto=�6�   
�������6�   �� 5&      -   5        $��3��5&      $��Bottom=�6-    *  &MaterialDesignFloatingActionMiniButton#��[  6H   .��5'      '  !MaterialDesignThemes.Wpf.PackIcon  �  �ControlzEx.PackIconBase`1[[MaterialDesignThemes.Wpf.PackIconKind, MaterialDesignThemes.Wpf, Version=2.6.0.325, Culture=neutral, PublicKeyToken=null]]   Kind$
 Send=�62   5(      �� 5)      -   5        $��2��5)      $��Bottom=�6C   #��[  6^   ��6-   Z� .��5*        $ 
Attachment=�62     PrimaryHueDarkBrush#��[ 6D   5+      �� 5,      -   5        $��1��5,   3   $��Bottom=�6C   #��[  6^   ��6   Z� .��5-        $ Smiley=�62   #��[ 6@   5.      5/      50      �� 51      -   5         ��Name$ ChatBox��51      $
��Left=�6'   $	��409��6B   $��
10,117,0,0q�6O   $	��Top=�6c   $	��774��6{   52      �� 54   
   $��2��6   ���	#FF292929.+�55      �� -   5        $��Right=�55      $��10q�61     MaterialDesignFlatButton#��[ 6=   .��56        $ Close=�6*   57      �� 59      $	��150��6   $	��150��6!   $ 80��6.   $��1q�6@   
���������5:      �� 5;       �� ImageSource$ IMG/hqdefault.jpg��6!   5=      �� 5?      $��Center=�6   $��0 10 0 0q�65   
�������$��18(�6Z   $
��Bold"�6h   �� 6{   $�Rouru��6   �� 6�   �� 6�   6�   �� 5A      $��20q�6   .+�5B      �� $ 
Horizontal=�6   $	��0 3q�66   �� 5C      $ 
Horizontal=�6   $	��0 3q�66   �� 5D      $ 
Horizontal=�6   $	��0 3q�66   5E      �� 5F      $ 
Horizontal=�6   $
��20 0q�62   5G      5H      5I      