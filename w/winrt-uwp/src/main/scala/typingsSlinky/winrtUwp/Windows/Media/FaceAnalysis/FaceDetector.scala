package typingsSlinky.winrtUwp.Windows.Media.FaceAnalysis

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVector
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapBounds
import typingsSlinky.winrtUwp.Windows.Graphics.Imaging.BitmapSize
import typingsSlinky.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Detects faces in a SoftwareBitmap . */
@js.native
trait FaceDetector extends js.Object {
  
  /**
    * Asynchronously detects faces in the provided SoftwareBitmap .
    * @param image The image data to be processed for face detection.
    * @return An asynchronous operation that returns a list of DetectedFace objects upon successful completion.
    */
  def detectFacesAsync(image: SoftwareBitmap): IPromiseWithIAsyncOperation[IVector[_]] = js.native
  /**
    * Asynchronously detects faces in the provided SoftwareBitmap within the specified search area.
    * @param image The image data to be processed for face detection.
    * @param searchArea The bounds within the SoftwareBitmap in which face detection will be performed.
    * @return An asynchronous operation that returns a list of DetectedFace objects upon successful completion.
    */
  def detectFacesAsync(image: SoftwareBitmap, searchArea: BitmapBounds): IPromiseWithIAsyncOperation[IVector[_]] = js.native
  
  /** Gets or sets the maximum detectable face size, in pixels. */
  var maxDetectableFaceSize: BitmapSize = js.native
  
  /** Gets or sets the minimum detectable face size, in pixels. */
  var minDetectableFaceSize: BitmapSize = js.native
}
