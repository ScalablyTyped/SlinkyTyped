package typingsSlinky.winrt.Windows.Storage.AccessCache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AccessCacheOptions extends js.Object
@JSGlobal("Windows.Storage.AccessCache.AccessCacheOptions")
@js.native
object AccessCacheOptions extends js.Object {
  
  @js.native
  sealed trait disallowUserInput extends AccessCacheOptions
  
  @js.native
  sealed trait fastLocationsOnly extends AccessCacheOptions
  
  @js.native
  sealed trait none extends AccessCacheOptions
  
  @js.native
  sealed trait suppressAccessTimeUpdate extends AccessCacheOptions
  
  @js.native
  sealed trait useReadOnlyCachedCopy extends AccessCacheOptions
}
