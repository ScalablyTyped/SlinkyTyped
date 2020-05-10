package typingsSlinky.tinder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TinderUpdates extends js.Object {
  var blocks: js.Array[_] = js.native
  var deleted_lists: js.Array[_] = js.native
  var last_activity_date: String = js.native
  var liked_messages: js.Array[TinderMessage] = js.native
  var lists: js.Array[_] = js.native
  var matches: js.Array[_] = js.native
  var matchmaker: js.Array[_] = js.native
  var squads: js.Array[_] = js.native
}

object TinderUpdates {
  @scala.inline
  def apply(
    blocks: js.Array[_],
    deleted_lists: js.Array[_],
    last_activity_date: String,
    liked_messages: js.Array[TinderMessage],
    lists: js.Array[_],
    matches: js.Array[_],
    matchmaker: js.Array[_],
    squads: js.Array[_]
  ): TinderUpdates = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], deleted_lists = deleted_lists.asInstanceOf[js.Any], last_activity_date = last_activity_date.asInstanceOf[js.Any], liked_messages = liked_messages.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], matchmaker = matchmaker.asInstanceOf[js.Any], squads = squads.asInstanceOf[js.Any])
    __obj.asInstanceOf[TinderUpdates]
  }
  @scala.inline
  implicit class TinderUpdatesOps[Self <: TinderUpdates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlocks(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleted_lists(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted_lists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_activity_date(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_activity_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLiked_messages(value: js.Array[TinderMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liked_messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLists(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatches(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchmaker(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchmaker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSquads(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("squads")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

