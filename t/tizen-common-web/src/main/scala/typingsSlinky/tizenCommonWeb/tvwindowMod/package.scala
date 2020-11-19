package typingsSlinky.tizenCommonWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object tvwindowMod {
  
  type AvailableWindowListCallback = js.Function1[
    /* type */ js.Array[typingsSlinky.tizenCommonWeb.tvwindowMod.WindowType], 
    scala.Unit
  ]
  
  type SourceChangedSuccessCallback = js.Function2[
    /* source */ typingsSlinky.tizenCommonWeb.systeminfoMod.SystemInfoVideoSourceInfo, 
    /* type */ typingsSlinky.tizenCommonWeb.tvwindowMod.WindowType, 
    scala.Unit
  ]
  
  type VideoResolutionChangeCallback = js.Function2[
    /* resolution */ typingsSlinky.tizenCommonWeb.tvwindowMod.VideoResolution, 
    /* type */ typingsSlinky.tizenCommonWeb.tvwindowMod.WindowType, 
    scala.Unit
  ]
  
  type WindowRectangleSuccessCallback = js.Function2[
    /* windowRect */ js.Array[java.lang.String], 
    /* type */ typingsSlinky.tizenCommonWeb.tvwindowMod.WindowType, 
    scala.Unit
  ]
}
