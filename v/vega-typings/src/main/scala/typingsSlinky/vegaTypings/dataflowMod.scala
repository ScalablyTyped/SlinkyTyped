package typingsSlinky.vegaTypings

import typingsSlinky.vegaTypings.vegaTypingsNumbers.`0`
import typingsSlinky.vegaTypings.vegaTypingsNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataflowMod {
  
  @JSImport("vega-typings/types/runtime/dataflow", "Operator")
  @js.native
  class Operator () extends StObject {
    def this(init: js.Any) = this()
    def this(init: js.UndefOr[scala.Nothing], update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _]) = this()
    def this(init: js.Any, update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _]) = this()
    def this(init: js.UndefOr[scala.Nothing], update: js.UndefOr[scala.Nothing], params: js.Any) = this()
    def this(
      init: js.UndefOr[scala.Nothing],
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _],
      params: js.Any
    ) = this()
    def this(init: js.Any, update: js.UndefOr[scala.Nothing], params: js.Any) = this()
    def this(init: js.Any, update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _], params: js.Any) = this()
    def this(
      init: js.UndefOr[scala.Nothing],
      update: js.UndefOr[scala.Nothing],
      params: js.UndefOr[scala.Nothing],
      react: Boolean
    ) = this()
    def this(init: js.UndefOr[scala.Nothing], update: js.UndefOr[scala.Nothing], params: js.Any, react: Boolean) = this()
    def this(
      init: js.UndefOr[scala.Nothing],
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _],
      params: js.UndefOr[scala.Nothing],
      react: Boolean
    ) = this()
    def this(
      init: js.UndefOr[scala.Nothing],
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _],
      params: js.Any,
      react: Boolean
    ) = this()
    def this(init: js.Any, update: js.UndefOr[scala.Nothing], params: js.UndefOr[scala.Nothing], react: Boolean) = this()
    def this(init: js.Any, update: js.UndefOr[scala.Nothing], params: js.Any, react: Boolean) = this()
    def this(
      init: js.Any,
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _],
      params: js.UndefOr[scala.Nothing],
      react: Boolean
    ) = this()
    def this(
      init: js.Any,
      update: js.Function2[/* obj */ js.Any, /* pulse */ js.Any, _],
      params: js.Any,
      react: Boolean
    ) = this()
    
    def evaluate(pulse: js.Any): js.Any = js.native
    
    def marshall(stamp: Double): js.Any = js.native
    
    def modified(): js.Function1[/* state */ js.Any, _] = js.native
    
    def parameters(params: js.Object): js.Array[Operator] = js.native
    def parameters(params: js.Object, react: js.UndefOr[scala.Nothing], initonly: Boolean): js.Array[Operator] = js.native
    def parameters(params: js.Object, react: Boolean): js.Array[Operator] = js.native
    def parameters(params: js.Object, react: Boolean, initonly: Boolean): js.Array[Operator] = js.native
    
    def run(pulse: js.Any): js.Any = js.native
    
    def set(value: js.Any): `1` | `0` = js.native
    
    def skip(): js.Function1[/* state */ js.Any, _] = js.native
    
    def targets(): js.Any = js.native
  }
  
  @JSImport("vega-typings/types/runtime/dataflow", "Transform")
  @js.native
  class Transform () extends Operator {
    def this(init: js.Any) = this()
    def this(init: js.UndefOr[scala.Nothing], params: js.Any) = this()
    def this(init: js.Any, params: js.Any) = this()
    
    def transform(pulse: js.Any): js.Any = js.native
    def transform(pulse: js.Any, params: js.Any): js.Any = js.native
  }
  
  @JSImport("vega-typings/types/runtime/dataflow", "changeset")
  @js.native
  def changeset(): Changeset_ = js.native
  
  @JSImport("vega-typings/types/runtime/dataflow", "ingest")
  @js.native
  def ingest(datum: js.Any): js.Any = js.native
  
  @JSImport("vega-typings/types/runtime/dataflow", "isTuple")
  @js.native
  def isTuple(t: js.Any): Boolean = js.native
  
  @JSImport("vega-typings/types/runtime/dataflow", "tupleid")
  @js.native
  def tupleid(t: js.Any): Double = js.native
  
  @js.native
  trait Changeset_ extends StObject {
    
    def insert(tuples: js.Any): this.type = js.native
    
    def modify(tuple: js.Any): this.type = js.native
    def modify(tuple: js.Any, field: js.UndefOr[scala.Nothing], value: js.Any): this.type = js.native
    def modify(tuple: js.Any, field: String): this.type = js.native
    def modify(tuple: js.Any, field: String, value: js.Any): this.type = js.native
    
    def remove(tuples: js.Any): this.type = js.native
  }
}
