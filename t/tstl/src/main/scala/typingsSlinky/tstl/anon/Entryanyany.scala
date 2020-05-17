package typingsSlinky.tstl.anon

import typingsSlinky.tstl.entryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tstl.tstl/utility/Entry.Entry</ * import warning: RewrittenClass.unapply cls was tparam Key * / any, / * import warning: RewrittenClass.unapply cls was tparam T * / any> */
@js.native
trait Entryanyany extends js.Object {
  /**
    * The first, key element.
    */
  val first: /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any = js.native
  /**
    * The second, mapped element.
    */
  var second: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any = js.native
  /**
    * @inheritDoc
    */
  def equals(
    obj: Entry[
      /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ _
    ]
  ): Boolean = js.native
  /**
    * @inheritDoc
    */
  def less(
    obj: Entry[
      /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ _
    ]
  ): Boolean = js.native
}

object Entryanyany {
  @scala.inline
  def apply(
    equals: Entry[
      /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ _
    ] => Boolean,
    first: /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any,
    less: Entry[
      /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ _
    ] => Boolean,
    second: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any
  ): Entryanyany = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), first = first.asInstanceOf[js.Any], less = js.Any.fromFunction1(less), second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entryanyany]
  }
  @scala.inline
  implicit class EntryanyanyOps[Self <: Entryanyany] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEquals(
      value: Entry[
          /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
          /* import warning: RewrittenClass.unapply cls was tparam T */ _
        ] => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFirst(value: /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLess(
      value: Entry[
          /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
          /* import warning: RewrittenClass.unapply cls was tparam T */ _
        ] => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("less")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSecond(value: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

