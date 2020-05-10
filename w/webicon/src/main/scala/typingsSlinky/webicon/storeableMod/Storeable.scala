package typingsSlinky.webicon.storeableMod

import typingsSlinky.webicon.downloadableMod.Downloadable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Storeable
  extends Downloadable[scala.Nothing] {
  /**
    * Resolves the id of the underlying source.
    *
    * @param id
    * The underlying id of the source.
    *
    * @return
    * The resolved id of the source.
    */
  var iconIdResolver: js.UndefOr[js.Function1[/* id */ String, String]] = js.native
  /**
    * A value indicating whether the source is preloadable.
    */
  var preloadable: js.UndefOr[Boolean] = js.native
}

object Storeable {
  @scala.inline
  def apply(): Storeable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Storeable]
  }
  @scala.inline
  implicit class StoreableOps[Self <: Storeable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconIdResolver(value: /* id */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconIdResolver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIconIdResolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconIdResolver")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadable")(js.undefined)
        ret
    }
  }
  
}

