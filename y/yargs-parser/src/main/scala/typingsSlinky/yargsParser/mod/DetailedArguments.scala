package typingsSlinky.yargsParser.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailedArguments extends js.Object {
  /** The inferred list of aliases built by combining lists in opts.alias. */
  var aliases: StringDictionary[js.Array[String]] = js.native
  /** An object representing the parsed value of `args` */
  var argv: Arguments = js.native
  /** The configuration loaded from the yargs stanza in package.json. */
  var configuration: Configuration = js.native
  /** Populated with an error object if an exception occurred during parsing. */
  var error: js.Error | Null = js.native
  /** Any new aliases added via camel-case expansion. */
  var newAliases: StringDictionary[Boolean] = js.native
}

object DetailedArguments {
  @scala.inline
  def apply(
    aliases: StringDictionary[js.Array[String]],
    argv: Arguments,
    configuration: Configuration,
    newAliases: StringDictionary[Boolean]
  ): DetailedArguments = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], argv = argv.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], newAliases = newAliases.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedArguments]
  }
  @scala.inline
  implicit class DetailedArgumentsOps[Self <: DetailedArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliases(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgv(value: Arguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfiguration(value: Configuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewAliases(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newAliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(null)
        ret
    }
  }
  
}

