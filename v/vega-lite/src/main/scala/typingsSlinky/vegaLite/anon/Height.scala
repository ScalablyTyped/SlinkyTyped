package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaLite.exprMod.ExprOrSignalRef
import typingsSlinky.vegaLite.titleMod.TitleParams
import typingsSlinky.vegaLite.transformMod.Transform
import typingsSlinky.vegaLite.vegaLiteStrings.container
import typingsSlinky.vegaTypings.encodeMod.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Height extends StObject {
  
  var data: js.UndefOr[typingsSlinky.vegaLite.srcDataMod.Data] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double | container | typingsSlinky.vegaLite.specBaseMod.Step] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[Text | TitleParams[ExprOrSignalRef]] = js.native
  
  var transform: js.UndefOr[js.Array[Transform]] = js.native
  
  var width: js.UndefOr[Double | container | typingsSlinky.vegaLite.specBaseMod.Step] = js.native
}
object Height {
  
  @scala.inline
  def apply(): Height = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: typingsSlinky.vegaLite.srcDataMod.Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | container | typingsSlinky.vegaLite.specBaseMod.Step): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTitle(value: Text | TitleParams[ExprOrSignalRef]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
    
    @scala.inline
    def setTransform(value: js.Array[Transform]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setTransformVarargs(value: Transform*): Self = StObject.set(x, "transform", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double | container | typingsSlinky.vegaLite.specBaseMod.Step): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
