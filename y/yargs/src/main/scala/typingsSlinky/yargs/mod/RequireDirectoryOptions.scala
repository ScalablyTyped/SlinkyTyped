package typingsSlinky.yargs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequireDirectoryOptions extends js.Object {
  /** Blacklist certain modules. */
  var exclude: js.UndefOr[js.RegExp | (js.Function1[/* pathToFile */ String, Boolean])] = js.native
  /** The types of files to look for when requiring command modules. */
  var extensions: js.UndefOr[js.Array[String]] = js.native
  /** Whitelist certain modules */
  var include: js.UndefOr[js.RegExp | (js.Function1[/* pathToFile */ String, Boolean])] = js.native
  /** Look for command modules in all subdirectories and apply them as a flattened (non-hierarchical) list. */
  var recurse: js.UndefOr[Boolean] = js.native
  /**
    * A synchronous function called for each command module encountered.
    * Accepts `commandObject`, `pathToFile`, and `filename` as arguments.
    * Returns `commandObject` to include the command; any falsy value to exclude/skip it.
    */
  var visit: js.UndefOr[
    js.Function3[
      /* commandObject */ js.Any, 
      /* pathToFile */ js.UndefOr[String], 
      /* filename */ js.UndefOr[String], 
      _
    ]
  ] = js.native
}

object RequireDirectoryOptions {
  @scala.inline
  def apply(): RequireDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequireDirectoryOptions]
  }
  @scala.inline
  implicit class RequireDirectoryOptionsOps[Self <: RequireDirectoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeFunction1(value: /* pathToFile */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExcludeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclude(value: js.RegExp | (js.Function1[/* pathToFile */ String, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeFunction1(value: /* pathToFile */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncludeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclude(value: js.RegExp | (js.Function1[/* pathToFile */ String, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurse")(js.undefined)
        ret
    }
    @scala.inline
    def withVisit(
      value: (/* commandObject */ js.Any, /* pathToFile */ js.UndefOr[String], /* filename */ js.UndefOr[String]) => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visit")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutVisit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visit")(js.undefined)
        ret
    }
  }
  
}

