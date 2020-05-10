package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Deferrable
// ~~~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/deferrable.js
//
/**
  * Abstract Deferrable interface. Use this if you want to create an interface that has a value any of the
  * Deferrables that Sequelize supports.
  */
@js.native
trait DeferrableAbstract extends js.Object {
  def toSql(): String = js.native
}

object DeferrableAbstract {
  @scala.inline
  def apply(toSql: () => String): DeferrableAbstract = {
    val __obj = js.Dynamic.literal(toSql = js.Any.fromFunction0(toSql))
    __obj.asInstanceOf[DeferrableAbstract]
  }
  @scala.inline
  implicit class DeferrableAbstractOps[Self <: DeferrableAbstract] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToSql(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSql")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

