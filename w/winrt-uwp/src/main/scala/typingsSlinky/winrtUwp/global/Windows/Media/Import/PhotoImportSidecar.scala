package typingsSlinky.winrtUwp.global.Windows.Media.Import

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sidecar file or a sibling file to a PhotoImportItem . */
@JSGlobal("Windows.Media.Import.PhotoImportSidecar")
@js.native
abstract class PhotoImportSidecar ()
  extends typingsSlinky.winrtUwp.Windows.Media.Import.PhotoImportSidecar {
  /** Gets the date of the sidecar or sibling file. */
  /* CompleteClass */
  override var date: js.Date = js.native
  /** Gets the name of the sidecar or sibling file. */
  /* CompleteClass */
  override var name: String = js.native
  /** Gets the size of the sidecar or sibling file, in bytes. */
  /* CompleteClass */
  override var sizeInBytes: Double = js.native
}

