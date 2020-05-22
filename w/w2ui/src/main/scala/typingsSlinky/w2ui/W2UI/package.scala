package typingsSlinky.w2ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object W2UI {
  type W2EventHandler = (js.Function1[/* e */ typingsSlinky.w2ui.W2UI.W2Event, scala.Unit]) | (js.Function2[/* id */ java.lang.String, /* e */ typingsSlinky.w2ui.W2UI.W2Event, scala.Unit])
  type W2Grid = typingsSlinky.w2ui.W2UI.W2Grid_
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.w2ui.W2UI.W2Layout
    - typingsSlinky.w2ui.W2UI.W2Grid
    - typingsSlinky.w2ui.W2UI.W2Toolbar
    - typingsSlinky.w2ui.W2UI.W2Sidebar
    - typingsSlinky.w2ui.W2UI.W2Tabs
    - typingsSlinky.w2ui.W2UI.W2Form
    - typingsSlinky.w2ui.W2UI.W2Popup
  */
  type W2Object = typingsSlinky.w2ui.W2UI._W2Object | typingsSlinky.w2ui.W2UI.W2Grid
  type W2UI = // morally, [s: string]<T extends W2Common>: T;
  org.scalablytyped.runtime.StringDictionary[js.Any]
}
