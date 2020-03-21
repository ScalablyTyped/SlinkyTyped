package typingsSlinky.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cellNav {
  type navigateHandler[TEntity] = js.Function2[
    /* newRowCol */ typingsSlinky.uiGrid.mod.cellNav.IRowCol[TEntity], 
    /* oldRowCol */ typingsSlinky.uiGrid.mod.cellNav.IRowCol[TEntity], 
    scala.Unit
  ]
  type viewportKeyDownHandler[TEntity] = js.Function2[
    /* event */ typingsSlinky.angular.JQueryKeyEventObject, 
    /* rowCol */ typingsSlinky.uiGrid.mod.cellNav.IRowCol[TEntity], 
    scala.Unit
  ]
  type viewportKeyPressHandler[TEntity] = js.Function2[
    /* event */ typingsSlinky.angular.JQueryKeyEventObject, 
    /* rowCol */ typingsSlinky.uiGrid.mod.cellNav.IRowCol[TEntity], 
    scala.Unit
  ]
}
