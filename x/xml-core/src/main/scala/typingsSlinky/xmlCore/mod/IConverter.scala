package typingsSlinky.xmlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConverter[T] extends js.Object {
  /**
    * Converts value from Object to Xml element
    *
    * @memberOf IConverter
    */
  def get(value: T): js.UndefOr[String] = js.native
  /**
    * Converts value from Xml element to Object
    *
    * @memberOf IConverter
    */
  def set(value: String): T = js.native
}

object IConverter {
  @scala.inline
  def apply[T](get: T => js.UndefOr[String], set: String => T): IConverter[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[IConverter[T]]
  }
  @scala.inline
  implicit class IConverterOps[Self[t] <: IConverter[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGet(value: T => js.UndefOr[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: String => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

