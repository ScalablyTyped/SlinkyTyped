package typingsSlinky.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@wordpress/components.@wordpress/components.Slot.Props, 'name'> */
@js.native
trait OmitPropsname extends StObject {
  
  var bubblesVirtually: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[js.Function1[/* fills */ js.Array[js.Array[ReactElement]], ReactElement | Null]] = js.native
  
  var fillProps: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object OmitPropsname {
  
  @scala.inline
  def apply(): OmitPropsname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitPropsname]
  }
  
  @scala.inline
  implicit class OmitPropsnameMutableBuilder[Self <: OmitPropsname] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubblesVirtually(value: Boolean): Self = StObject.set(x, "bubblesVirtually", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubblesVirtuallyUndefined: Self = StObject.set(x, "bubblesVirtually", js.undefined)
    
    @scala.inline
    def setChildren(value: /* fills */ js.Array[js.Array[ReactElement]] => ReactElement | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setFillProps(value: StringDictionary[js.Any]): Self = StObject.set(x, "fillProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillPropsUndefined: Self = StObject.set(x, "fillProps", js.undefined)
  }
}
