package typingsSlinky.wordpressComponents.anon

import typingsSlinky.wordpressComponents.cardMod.Card.CardSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsBorderless[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] extends StObject {
  
  /**
    * Render as a different element type
    */
  var as: js.UndefOr[T] = js.native
  
  /**
    * `className` of the container.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Renders a borderless card.
    */
  var isBorderless: js.UndefOr[Boolean] = js.native
  
  /**
    * Add visual shading style.
    */
  var isShady: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[CardSize] = js.native
}
object IsBorderless {
  
  @scala.inline
  def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */](): IsBorderless[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsBorderless[T]]
  }
  
  @scala.inline
  implicit class IsBorderlessMutableBuilder[Self <: IsBorderless[_], T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] (val x: Self with IsBorderless[T]) extends AnyVal {
    
    @scala.inline
    def setAs(value: T): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setIsBorderless(value: Boolean): Self = StObject.set(x, "isBorderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBorderlessUndefined: Self = StObject.set(x, "isBorderless", js.undefined)
    
    @scala.inline
    def setIsShady(value: Boolean): Self = StObject.set(x, "isShady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsShadyUndefined: Self = StObject.set(x, "isShady", js.undefined)
    
    @scala.inline
    def setSize(value: CardSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
