   M S B A M L   `   `   `  ����F  BMainProject, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null)clr-namespace:MainProjectMainProject  5   	       MainProject.MainWindow   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   +localclr-namespace:MainProject     5   	     � Title$  
MainWindow��5   	   $��678.2��6   $	��985��6+    � 
ResizeMode$ NoResize=�67    � WindowStartupLocation$ CenterScreen=�6M    � WindowStyle$
 None=�6r   ��5	      �� 5
   
    �� ImageSource$ IMG/Fundo.jpg��6   .��5      �  � ColumnDefinitions 5   
   �� 5      $
��752* �6   �� 5      $
��233* �6   ��5   
   �� 5      $ IMG/Fundo.jpg��6   .+�5   
   �� $
��Left=�6   $	��678��6/   $	��Top=�6<   $	��243��6T   $��2��6`   $��	742,0,0,0q�6t   ��5      �� 5       �� EndPoint$ 0.5,1&�6&    �� 
StartPoint$ 0.5,0&�67   .��5      �  � Color$ Black��6#   	 � Offset$	 0Q�61   � 5      $ 	#B29B0909��6#   $	 1Q�65   5      5      �� 5   
   -   5        
 ��Name$
 pbLogin��5      $��1��6#   $��26��63   $��25,255,29,0q�6?    �� TextWrapping$
 Wrap=�6T   $	��Top=�6h   $��Center=�6�   $��Center=�6�   
���������6�   Z�  �� SelectionBrush 6�   Z� .��6	  ��5      �� 5      $ 0.5,1&�6&   $ 0.5,0&�67   .��5      � $ 	#FFFF3A00��6#   � 5       $ 	#FFFF7400��6#   $	 1Q�65   5!      .��5"   #   5#      G� 5$   
   -   5         G�Name$ pbSenha��5$      $��1��6'   $
��Left=�67   $��
25,312,0,0q�6R   $	��Top=�6f   $	��179��6~   $��26��6�   $��Center=�6�   $��Center=�6�   
���������6�   Z�  G� SelectionBrush 6�   Z� ��5%      �� 5&      $ 0.5,1&�6&   $ 0.5,0&�67   .��5'      � $ 	#FFFF3A00��6#   $	 0Q�65   � 5(      $ 	#FFFF7400��6#   $	 1Q�65   5)      5+      �� 5,   
   -   5         ��Name$ lbSenha��5,      $��Senha��6!   $��1��61   $
��Left=�6A   $��
25,286,0,0q�6\   $	��Top=�6p   ���	#FFCF8F8F6�   �� 5-   
   -   5        $ 	lbUsuario��5-      $��Usuario��6#   $��1��65   $
��Left=�6E   $��
25,229,0,0q�6`   $	��Top=�6t   ���	#FFCF8F8F6�   �� 5.   
   -   5         ��Name$ button��5.      $��Iniciar Sessão��6!   $��1��6:   $
��Left=�6J   $��
25,492,0,0q�6e   $	��Top=�6y   $	��179��6�   $��29��6�   ���	#FFBF3333
���������6�   Z� 6�   �� 5/   
   -   5        $ lbErroLogin��5/      $�� ��6%   $��1��60   $
��Left=�6@   $��
25,366,0,0q�6[   $	��Top=�6o   $��52��6�   $	��179��6�   
�������$��Center=�6�   $��Center=�6�   51      52      