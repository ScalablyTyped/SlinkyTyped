package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.semanticUiReact.advertisementAdvertisementMod.AdvertisementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object advertisementMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Advertisement", JSImport.Default)
  @js.native
  val default: ReactComponentClass[AdvertisementProps] = js.native
  
  type _To = ReactComponentClass[AdvertisementProps]
  
  /* This means you don't have to write `default`, but can instead just say `advertisementMod.foo` */
  override def _to: ReactComponentClass[AdvertisementProps] = default
}
