package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.vegaLiteStrings.geojson
import typingsSlinky.vegaLite.vegaLiteStrings.nominal
import typingsSlinky.vegaLite.vegaLiteStrings.ordinal
import typingsSlinky.vegaLite.vegaLiteStrings.quantitative
import typingsSlinky.vegaLite.vegaLiteStrings.temporal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTypeMod {
  
  @JSImport("vega-lite/build/src/type", "GEOJSON")
  @js.native
  val GEOJSON: geojson = js.native
  
  @JSImport("vega-lite/build/src/type", "NOMINAL")
  @js.native
  val NOMINAL: nominal = js.native
  
  @JSImport("vega-lite/build/src/type", "ORDINAL")
  @js.native
  val ORDINAL: ordinal = js.native
  
  @JSImport("vega-lite/build/src/type", "QUANTITATIVE")
  @js.native
  val QUANTITATIVE: quantitative = js.native
  
  @JSImport("vega-lite/build/src/type", "TEMPORAL")
  @js.native
  val TEMPORAL: temporal = js.native
  
  @JSImport("vega-lite/build/src/type", "TYPES")
  @js.native
  val TYPES: js.Array[ordinal | geojson | quantitative | temporal | nominal] = js.native
  
  /* keyof vega-lite.anon.Geojson */ /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.quantitative
    - typingsSlinky.vegaLite.vegaLiteStrings.ordinal
    - typingsSlinky.vegaLite.vegaLiteStrings.temporal
    - typingsSlinky.vegaLite.vegaLiteStrings.nominal
    - typingsSlinky.vegaLite.vegaLiteStrings.geojson
  */
  trait Type extends StObject
  object Type {
    
    @JSImport("vega-lite/build/src/type", "Type.geojson")
    @js.native
    val geojson: typingsSlinky.vegaLite.vegaLiteStrings.geojson = js.native
    
    @JSImport("vega-lite/build/src/type", "Type.nominal")
    @js.native
    val nominal: typingsSlinky.vegaLite.vegaLiteStrings.nominal = js.native
    
    @JSImport("vega-lite/build/src/type", "Type.ordinal")
    @js.native
    val ordinal: typingsSlinky.vegaLite.vegaLiteStrings.ordinal = js.native
    
    @JSImport("vega-lite/build/src/type", "Type.quantitative")
    @js.native
    val quantitative: typingsSlinky.vegaLite.vegaLiteStrings.quantitative = js.native
    
    @JSImport("vega-lite/build/src/type", "Type.temporal")
    @js.native
    val temporal: typingsSlinky.vegaLite.vegaLiteStrings.temporal = js.native
  }
  
  @JSImport("vega-lite/build/src/type", "getFullName")
  @js.native
  def getFullName(`type`: String): js.UndefOr[Type] = js.native
  @JSImport("vega-lite/build/src/type", "getFullName")
  @js.native
  def getFullName(`type`: Type): js.UndefOr[Type] = js.native
  
  @JSImport("vega-lite/build/src/type", "isType")
  @js.native
  def isType(t: js.Any): /* is vega-lite.vega-lite/build/src/type.Type */ Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.quantitative
    - typingsSlinky.vegaLite.vegaLiteStrings.ordinal
    - typingsSlinky.vegaLite.vegaLiteStrings.temporal
    - typingsSlinky.vegaLite.vegaLiteStrings.nominal
  */
  trait StandardType extends StObject
  object StandardType {
    
    @scala.inline
    def nominal: typingsSlinky.vegaLite.vegaLiteStrings.nominal = "nominal".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.nominal]
    
    @scala.inline
    def ordinal: typingsSlinky.vegaLite.vegaLiteStrings.ordinal = "ordinal".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.ordinal]
    
    @scala.inline
    def quantitative: typingsSlinky.vegaLite.vegaLiteStrings.quantitative = "quantitative".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.quantitative]
    
    @scala.inline
    def temporal: typingsSlinky.vegaLite.vegaLiteStrings.temporal = "temporal".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.temporal]
  }
}
