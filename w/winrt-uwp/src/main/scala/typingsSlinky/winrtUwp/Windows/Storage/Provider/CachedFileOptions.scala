package typingsSlinky.winrtUwp.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CachedFileOptions extends js.Object
/** Describes when Windows will request an update to a file. */
@JSGlobal("Windows.Storage.Provider.CachedFileOptions")
@js.native
object CachedFileOptions extends js.Object {
  
  /** An update triggers when another app accesses the locally cached copy of the file if a network connection is available. Otherwise, other apps are denied access to the local file. */
  @js.native
  sealed trait denyAccessWhenOffline extends CachedFileOptions
  
  /** Another app may be able to access the locally cached copy of the file without triggering an update. */
  @js.native
  sealed trait none extends CachedFileOptions
  
  /** An update always triggers when another app accesses the locally cached copy of the file. */
  @js.native
  sealed trait requireUpdateOnAccess extends CachedFileOptions
  
  /** An update triggers when another app accesses the locally cached copy of the file if a network connection is available. Otherwise, other apps can access the local file without triggering an update. */
  @js.native
  sealed trait useCachedFileWhenOffline extends CachedFileOptions
}
