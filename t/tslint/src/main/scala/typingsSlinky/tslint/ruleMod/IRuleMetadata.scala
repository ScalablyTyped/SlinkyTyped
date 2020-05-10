package typingsSlinky.tslint.ruleMod

import typingsSlinky.tslint.AnonOptionsAny
import typingsSlinky.tslint.tslintBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRuleMetadata extends js.Object {
  /**
    * Examples demonstrating what the lint rule will pass and fail
    */
  var codeExamples: js.UndefOr[js.Array[ICodeExample]] = js.native
  /**
    * A rule deprecation message, if applicable.
    */
  var deprecationMessage: js.UndefOr[String] = js.native
  /**
    * A short, one line description of what the rule does.
    */
  var description: String = js.native
  /**
    * More elaborate details about the rule.
    */
  var descriptionDetails: js.UndefOr[String] = js.native
  /**
    * Whether or not the rule will provide fix suggestions.
    */
  var hasFix: js.UndefOr[Boolean] = js.native
  /**
    * Examples of what a standard config for the rule might look like.
    * Using a string[] here is deprecated. Write the options as a JSON object instead.
    */
  var optionExamples: js.UndefOr[js.Array[`true` | AnonOptionsAny | js.Array[_] | String]] = js.native
  /**
    * Schema of the options the rule accepts.
    * The first boolean for whether the rule is enabled or not is already implied.
    * This field describes the options after that boolean.
    * If null, this rule has no options and is not configurable.
    */
  var options: js.Any = js.native
  /**
    * An explanation of the available options for the rule.
    */
  var optionsDescription: String = js.native
  /**
    * An explanation of why the rule is useful.
    */
  var rationale: js.UndefOr[String] = js.native
  /**
    * Whether or not the rule requires type info to run.
    */
  var requiresTypeInfo: js.UndefOr[Boolean] = js.native
  /**
    * The kebab-case name of the rule.
    */
  var ruleName: String = js.native
  /**
    * The type of the rule - its overall purpose
    */
  var `type`: RuleType = js.native
  /**
    * Whether or not the rule use for TypeScript only. If `false`, this rule may be used with .js files.
    */
  var typescriptOnly: Boolean = js.native
}

object IRuleMetadata {
  @scala.inline
  def apply(
    description: String,
    options: js.Any,
    optionsDescription: String,
    ruleName: String,
    `type`: RuleType,
    typescriptOnly: Boolean
  ): IRuleMetadata = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], optionsDescription = optionsDescription.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], typescriptOnly = typescriptOnly.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRuleMetadata]
  }
  @scala.inline
  implicit class IRuleMetadataOps[Self <: IRuleMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: RuleType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTypescriptOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typescriptOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeExamples(value: js.Array[ICodeExample]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeExamples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCodeExamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeExamples")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecationMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecationMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecationMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptionDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptionDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptionDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withHasFix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasFix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasFix")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionExamples(value: js.Array[`true` | AnonOptionsAny | js.Array[_] | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionExamples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionExamples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionExamples")(js.undefined)
        ret
    }
    @scala.inline
    def withRationale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rationale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRationale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rationale")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiresTypeInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiresTypeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiresTypeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiresTypeInfo")(js.undefined)
        ret
    }
  }
  
}

