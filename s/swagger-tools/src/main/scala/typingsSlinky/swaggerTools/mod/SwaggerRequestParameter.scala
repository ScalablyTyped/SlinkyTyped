package typingsSlinky.swaggerTools.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwaggerRequestParameter[T] extends js.Object {
  var originalValue: js.Any = js.native
  var path: js.Array[String] = js.native
  var schema: SwaggerParameterSchema = js.native
  var value: T = js.native
}

object SwaggerRequestParameter {
  @scala.inline
  def apply[T](originalValue: js.Any, path: js.Array[String], schema: SwaggerParameterSchema, value: T): SwaggerRequestParameter[T] = {
    val __obj = js.Dynamic.literal(originalValue = originalValue.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerRequestParameter[T]]
  }
  @scala.inline
  implicit class SwaggerRequestParameterOps[Self[t] <: SwaggerRequestParameter[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOriginalValue(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: SwaggerParameterSchema): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

