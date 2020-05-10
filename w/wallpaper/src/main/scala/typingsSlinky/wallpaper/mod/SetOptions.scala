package typingsSlinky.wallpaper.mod

import typingsSlinky.wallpaper.wallpaperStrings.all
import typingsSlinky.wallpaper.wallpaperStrings.auto
import typingsSlinky.wallpaper.wallpaperStrings.center
import typingsSlinky.wallpaper.wallpaperStrings.fill
import typingsSlinky.wallpaper.wallpaperStrings.fit
import typingsSlinky.wallpaper.wallpaperStrings.main
import typingsSlinky.wallpaper.wallpaperStrings.stretch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetOptions extends js.Object {
  /**
  		__macOS only.__
  		Scaling method. Values: `auto` `fill` `fit` `stretch` `center`.
  		@default 'auto'
  		*/
  val scale: js.UndefOr[auto | fill | fit | stretch | center] = js.native
  /**
  		__macOS only.__
  		The screen to set the wallpaper on.
  		Values: `all`, `main`, or the index of a screen from `.screens()`.
  		*On Linux and Windows it's hard-coded to `main`.*
  		@default 'all'
  		*/
  val screen: js.UndefOr[all | main | Double] = js.native
}

object SetOptions {
  @scala.inline
  def apply(): SetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions]
  }
  @scala.inline
  implicit class SetOptionsOps[Self <: SetOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScale(value: auto | fill | fit | stretch | center): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withScreen(value: all | main | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen")(js.undefined)
        ret
    }
  }
  
}

