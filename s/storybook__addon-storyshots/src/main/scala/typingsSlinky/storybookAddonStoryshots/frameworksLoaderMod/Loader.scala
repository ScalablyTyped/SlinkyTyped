package typingsSlinky.storybookAddonStoryshots.frameworksLoaderMod

import typingsSlinky.storybookAddonStoryshots.AnonFramework
import typingsSlinky.storybookAddonStoryshots.storyshotsOptionsMod.StoryshotsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loader extends js.Object {
  def load(options: StoryshotsOptions): AnonFramework = js.native
  def test(options: StoryshotsOptions): Boolean = js.native
}

object Loader {
  @scala.inline
  def apply(load: StoryshotsOptions => AnonFramework, test: StoryshotsOptions => Boolean): Loader = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[Loader]
  }
  @scala.inline
  implicit class LoaderOps[Self <: Loader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoad(value: StoryshotsOptions => AnonFramework): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTest(value: StoryshotsOptions => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

