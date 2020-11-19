package typingsSlinky.superstruct.indexCjsMod

import typingsSlinky.superstruct.anon.PartialStructFailure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `StructContext` contains information about the current value being
  * validated as well as helper functions for failures and recursive validating.
  */
/**
  * A `StructContext` contains information about the current value being
  * validated as well as helper functions for failures and recursive validating.
  */
@js.native
trait StructContext extends js.Object {
  
  var branch: js.Array[_] = js.native
  
  def check(value: js.Any, struct: Struct_[_ | scala.Nothing, _]): js.Iterable[StructFailure] = js.native
  def check(
    value: js.Any,
    struct: Struct_[_ | scala.Nothing, _],
    parent: js.UndefOr[scala.Nothing],
    key: String
  ): js.Iterable[StructFailure] = js.native
  def check(
    value: js.Any,
    struct: Struct_[_ | scala.Nothing, _],
    parent: js.UndefOr[scala.Nothing],
    key: Double
  ): js.Iterable[StructFailure] = js.native
  def check(value: js.Any, struct: Struct_[_ | scala.Nothing, _], parent: js.Any): js.Iterable[StructFailure] = js.native
  def check(value: js.Any, struct: Struct_[_ | scala.Nothing, _], parent: js.Any, key: String): js.Iterable[StructFailure] = js.native
  def check(value: js.Any, struct: Struct_[_ | scala.Nothing, _], parent: js.Any, key: Double): js.Iterable[StructFailure] = js.native
  
  def fail(): StructFailure = js.native
  def fail(props: PartialStructFailure): StructFailure = js.native
  
  var path: js.Array[String | Double] = js.native
  
  var `type`: String = js.native
  
  var value: js.Any = js.native
}
