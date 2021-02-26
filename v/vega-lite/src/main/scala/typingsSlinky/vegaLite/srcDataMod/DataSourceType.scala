package typingsSlinky.vegaLite.srcDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataSourceType extends StObject
@JSImport("vega-lite/build/src/data", "DataSourceType")
@js.native
object DataSourceType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataSourceType with Double] = js.native
  
  @js.native
  sealed trait Column extends DataSourceType
  /* 3 */ val Column: typingsSlinky.vegaLite.srcDataMod.DataSourceType.Column with Double = js.native
  
  @js.native
  sealed trait Lookup extends DataSourceType
  /* 4 */ val Lookup: typingsSlinky.vegaLite.srcDataMod.DataSourceType.Lookup with Double = js.native
  
  @js.native
  sealed trait Main extends DataSourceType
  /* 1 */ val Main: typingsSlinky.vegaLite.srcDataMod.DataSourceType.Main with Double = js.native
  
  @js.native
  sealed trait Raw extends DataSourceType
  /* 0 */ val Raw: typingsSlinky.vegaLite.srcDataMod.DataSourceType.Raw with Double = js.native
  
  @js.native
  sealed trait Row extends DataSourceType
  /* 2 */ val Row: typingsSlinky.vegaLite.srcDataMod.DataSourceType.Row with Double = js.native
}
