package typingsSlinky.tuyaPanelKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object stackTypesMod {
  
  type StackCardStyleInterpolator = js.Function1[
    /* props */ typingsSlinky.tuyaPanelKit.stackTypesMod.StackCardInterpolationProps, 
    typingsSlinky.tuyaPanelKit.stackTypesMod.StackCardInterpolatedStyle
  ]
  
  type StackDescriptor = typingsSlinky.tuyaPanelKit.typesMod.Descriptor[
    typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase, 
    java.lang.String, 
    typingsSlinky.tuyaPanelKit.stackRouterMod.StackNavigationState[typingsSlinky.tuyaPanelKit.routersTypesMod.ParamListBase], 
    typingsSlinky.tuyaPanelKit.stackTypesMod.StackNavigationOptions, 
    js.Object
  ]
  
  type StackDescriptorMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.tuyaPanelKit.stackTypesMod.StackDescriptor]
  
  type StackHeaderStyleInterpolator = js.Function1[
    /* props */ typingsSlinky.tuyaPanelKit.stackTypesMod.StackHeaderInterpolationProps, 
    typingsSlinky.tuyaPanelKit.stackTypesMod.StackHeaderInterpolatedStyle
  ]
}
