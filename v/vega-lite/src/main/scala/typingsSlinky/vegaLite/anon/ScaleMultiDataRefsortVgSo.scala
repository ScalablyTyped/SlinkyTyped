package typingsSlinky.vegaLite.anon

import typingsSlinky.vegaTypings.scaleMod.ScaleDataRef
import typingsSlinky.vegaTypings.scaleMod.SortField
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega.vega.ScaleMultiDataRef & {  sort :vega-lite.vega-lite/build/src/vega.schema.VgSortField | undefined} */
@js.native
trait ScaleMultiDataRefsortVgSo extends StObject {
  
  var fields: js.Array[(js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef] = js.native
  
  var sort: js.UndefOr[SortField] = js.native
}
object ScaleMultiDataRefsortVgSo {
  
  @scala.inline
  def apply(fields: js.Array[(js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef]): ScaleMultiDataRefsortVgSo = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleMultiDataRefsortVgSo]
  }
  
  @scala.inline
  implicit class ScaleMultiDataRefsortVgSoMutableBuilder[Self <: ScaleMultiDataRefsortVgSo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[(js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: ((js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef)*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setSort(value: SortField): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
