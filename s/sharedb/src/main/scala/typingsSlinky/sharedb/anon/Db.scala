package typingsSlinky.sharedb.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sharedb.mod.ExtraDB
import typingsSlinky.sharedb.mod.PubSub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Db extends js.Object {
  var db: js.UndefOr[js.Any] = js.native
  var disableDocAction: js.UndefOr[Boolean] = js.native
  var disableSpaceDelimitedActions: js.UndefOr[Boolean] = js.native
  var extraDbs: js.UndefOr[StringDictionary[ExtraDB]] = js.native
  var pubsub: js.UndefOr[PubSub] = js.native
}

object Db {
  @scala.inline
  def apply(): Db = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Db]
  }
  @scala.inline
  implicit class DbOps[Self <: Db] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDb(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("db")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDocAction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDocAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDocAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDocAction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableSpaceDelimitedActions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSpaceDelimitedActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSpaceDelimitedActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSpaceDelimitedActions")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraDbs(value: StringDictionary[ExtraDB]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraDbs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraDbs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraDbs")(js.undefined)
        ret
    }
    @scala.inline
    def withPubsub(value: PubSub): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubsub")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPubsub: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pubsub")(js.undefined)
        ret
    }
  }
  
}

