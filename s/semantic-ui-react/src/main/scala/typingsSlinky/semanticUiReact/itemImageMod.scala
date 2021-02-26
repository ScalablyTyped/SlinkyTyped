package typingsSlinky.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.semanticUiReact.imageImageMod.ImageProps
import typingsSlinky.semanticUiReact.imageImageMod.StrictImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemImageMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/views/Item/ItemImage", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ItemImageProps] = js.native
  
  type ItemImageProps = ImageProps
  
  type StrictItemImageProps = StrictImageProps
  
  type _To = ReactComponentClass[ItemImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `itemImageMod.foo` */
  override def _to: ReactComponentClass[ItemImageProps] = default
}
