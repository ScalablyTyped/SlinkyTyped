package typingsSlinky.winrt.global.Windows.ApplicationModel

import typingsSlinky.winrt.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrt.Windows.Foundation.Uri
import typingsSlinky.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Package")
@js.native
class Package ()
  extends typingsSlinky.winrt.Windows.ApplicationModel.Package {
  /* CompleteClass */
  override var dependencies: IVectorView[typingsSlinky.winrt.Windows.ApplicationModel.Package] = js.native
  /* CompleteClass */
  override var description: String = js.native
  /* CompleteClass */
  override var displayName: String = js.native
  /* CompleteClass */
  override var id: typingsSlinky.winrt.Windows.ApplicationModel.PackageId = js.native
  /* CompleteClass */
  override var installedLocation: StorageFolder = js.native
  /* CompleteClass */
  override var isBundle: Boolean = js.native
  /* CompleteClass */
  override var isDevelopmentMode: Boolean = js.native
  /* CompleteClass */
  override var isFramework: Boolean = js.native
  /* CompleteClass */
  override var isResourcePackage: Boolean = js.native
  /* CompleteClass */
  override var logo: Uri = js.native
  /* CompleteClass */
  override var publisherDisplayName: String = js.native
}

/* static members */
@JSGlobal("Windows.ApplicationModel.Package")
@js.native
object Package extends js.Object {
  var current: typingsSlinky.winrt.Windows.ApplicationModel.Package = js.native
}

