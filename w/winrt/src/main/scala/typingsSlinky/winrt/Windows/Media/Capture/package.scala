package typingsSlinky.winrt.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Capture {
  
  type MediaCaptureFailedEventHandler = js.Function2[
    /* sender */ typingsSlinky.winrt.Windows.Media.Capture.MediaCapture, 
    /* errorEventArgs */ typingsSlinky.winrt.Windows.Media.Capture.MediaCaptureFailedEventArgs, 
    scala.Unit
  ]
  
  type RecordLimitationExceededEventHandler = js.Function1[/* sender */ typingsSlinky.winrt.Windows.Media.Capture.MediaCapture, scala.Unit]
}
