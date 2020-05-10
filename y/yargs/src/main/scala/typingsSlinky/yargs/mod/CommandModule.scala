package typingsSlinky.yargs.mod

import typingsSlinky.yargs.yargsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandModule[T, U] extends js.Object {
  /** array of strings (or a single string) representing aliases of `exports.command`, positional args defined in an alias are ignored */
  var aliases: js.UndefOr[js.Array[String] | String] = js.native
  /** object declaring the options the command accepts, or a function accepting and returning a yargs instance */
  var builder: js.UndefOr[CommandBuilder[T, U]] = js.native
  /** string (or array of strings) that executes this command when given on the command line, first string may contain positional args */
  var command: js.UndefOr[js.Array[String] | String] = js.native
  /** string used as the description for the command in help text, use `false` for a hidden command */
  var describe: js.UndefOr[String | `false`] = js.native
  /** a function which will be passed the parsed argv. */
  def handler(args: Arguments[U]): Unit = js.native
}

object CommandModule {
  @scala.inline
  def apply[T, U](handler: Arguments[U] => Unit): CommandModule[T, U] = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler))
    __obj.asInstanceOf[CommandModule[T, U]]
  }
  @scala.inline
  implicit class CommandModuleOps[Self[t, u] <: CommandModule[t, u], T, U] (val x: Self[T, U]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, U] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, U]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, U]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, U]) with Other]
    @scala.inline
    def withHandler(value: Arguments[U] => Unit): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAliases(value: js.Array[String] | String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(js.undefined)
        ret
    }
    @scala.inline
    def withBuilderFunction1(value: /* args */ Argv[T] => Argv[U] | js.Thenable[Argv[U]]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBuilder(value: CommandBuilder[T, U]): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuilder: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder")(js.undefined)
        ret
    }
    @scala.inline
    def withCommand(value: js.Array[String] | String): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommand: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.undefined)
        ret
    }
    @scala.inline
    def withDescribe(value: String | `false`): Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescribe: Self[T, U] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describe")(js.undefined)
        ret
    }
  }
  
}

