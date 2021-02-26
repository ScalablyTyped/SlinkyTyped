package typingsSlinky.tuyaPanelKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnyFunction = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type DpValue = scala.Boolean | scala.Double | java.lang.String
  
  type GotoDpAlarmData = js.Array[typingsSlinky.tuyaPanelKit.anon.DpId]
  
  type LinearGradientBackgroundOffset = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type ScreenOptions = typingsSlinky.tuyaPanelKit.stackTypesMod.StackNavigationOptions | (js.Function1[
    /* props */ typingsSlinky.tuyaPanelKit.anon.NavigationAny, 
    typingsSlinky.tuyaPanelKit.stackTypesMod.StackNavigationOptions
  ])
  
  type TabBarArr = org.scalablytyped.runtime.NumberDictionary[typingsSlinky.tuyaPanelKit.anon.AccessibilityLabel]
  
  @scala.inline
  def createNavigator[P, S](createNavigatorParam: typingsSlinky.tuyaPanelKit.mod.NavigationParam): typingsSlinky.tuyaPanelKit.mod.NavigationComponentClass[P, S] = typingsSlinky.tuyaPanelKit.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNavigator")(createNavigatorParam.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.tuyaPanelKit.mod.NavigationComponentClass[P, S]]
  
  @scala.inline
  def defaultTheme: typingsSlinky.tuyaPanelKit.themeMod.GlobalTheme = typingsSlinky.tuyaPanelKit.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultTheme").asInstanceOf[typingsSlinky.tuyaPanelKit.themeMod.GlobalTheme]
  @scala.inline
  def defaultTheme_=(x: typingsSlinky.tuyaPanelKit.themeMod.GlobalTheme): scala.Unit = typingsSlinky.tuyaPanelKit.mod.^.asInstanceOf[js.Dynamic].updateDynamic("defaultTheme")(x.asInstanceOf[js.Any])
}
