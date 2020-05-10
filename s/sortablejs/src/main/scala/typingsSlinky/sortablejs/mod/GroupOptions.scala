package typingsSlinky.sortablejs.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.sortablejs.sortablejsStrings.clone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupOptions extends js.Object {
  /**
    * a canonical version of pull, created by Sortable
    */
  var checkPull: js.UndefOr[
    js.Function4[
      /* sortable */ Sortable, 
      /* activeSortable */ Sortable, 
      /* dragEl */ HTMLElement, 
      /* event */ SortableEvent, 
      Boolean | String | js.Array[String]
    ]
  ] = js.native
  /**
    * a canonical version of put, created by Sortable
    */
  var checkPut: js.UndefOr[
    js.Function4[
      /* sortable */ Sortable, 
      /* activeSortable */ Sortable, 
      /* dragEl */ HTMLElement, 
      /* event */ SortableEvent, 
      Boolean | String | clone | js.Array[String]
    ]
  ] = js.native
  /**
    * group name
    */
  var name: String = js.native
  /**
    * ability to move from the list. clone — copy the item, rather than move.
    */
  var pull: js.UndefOr[
    PullResult | (js.Function4[
      /* to */ Sortable, 
      /* from */ Sortable, 
      /* dragEl */ HTMLElement, 
      /* event */ SortableEvent, 
      PullResult
    ])
  ] = js.native
  /**
    * whether elements can be added from other lists, or an array of group names from which elements can be taken.
    */
  var put: js.UndefOr[
    PutResult | (js.Function4[
      /* to */ Sortable, 
      /* from */ Sortable, 
      /* dragEl */ HTMLElement, 
      /* event */ SortableEvent, 
      PutResult
    ])
  ] = js.native
  /**
    * revert cloned element to initial position after moving to a another list.
    */
  var revertClone: js.UndefOr[Boolean] = js.native
}

object GroupOptions {
  @scala.inline
  def apply(name: String): GroupOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupOptions]
  }
  @scala.inline
  implicit class GroupOptionsOps[Self <: GroupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckPull(
      value: (/* sortable */ Sortable, /* activeSortable */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => Boolean | String | js.Array[String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkPull")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutCheckPull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkPull")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckPut(
      value: (/* sortable */ Sortable, /* activeSortable */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => Boolean | String | clone | js.Array[String]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkPut")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutCheckPut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkPut")(js.undefined)
        ret
    }
    @scala.inline
    def withPullFunction4(
      value: (/* to */ Sortable, /* from */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => PullResult
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withPull(
      value: PullResult | (js.Function4[
          /* to */ Sortable, 
          /* from */ Sortable, 
          /* dragEl */ HTMLElement, 
          /* event */ SortableEvent, 
          PullResult
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pull")(js.undefined)
        ret
    }
    @scala.inline
    def withPutFunction4(
      value: (/* to */ Sortable, /* from */ Sortable, /* dragEl */ HTMLElement, /* event */ SortableEvent) => PutResult
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withPut(
      value: PutResult | (js.Function4[
          /* to */ Sortable, 
          /* from */ Sortable, 
          /* dragEl */ HTMLElement, 
          /* event */ SortableEvent, 
          PutResult
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.undefined)
        ret
    }
    @scala.inline
    def withRevertClone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertClone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevertClone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertClone")(js.undefined)
        ret
    }
  }
  
}

