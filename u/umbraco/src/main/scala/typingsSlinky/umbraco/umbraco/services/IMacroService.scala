package typingsSlinky.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.services.macroService
  *
  *
  * @description
  * A service to return macro information such as generating syntax to insert a macro into an editor
  */
@js.native
trait IMacroService extends js.Object {
  /**
    * @ngdoc function
    * @name umbraco.services.macroService#generateWebFormsSyntax
    * @methodOf umbraco.services.macroService
    * @function
    *
    * @description
    * generates the syntax for inserting a macro into a rich text editor - this is the very old umbraco style syntax
    *
    * @param {object} args an object containing the macro alias and it's parameter values
    */
  def generateMacroSyntax(args: js.Any*): Unit = js.native
  /**
    * @ngdoc function
    * @name umbraco.services.macroService#generateMvcSyntax
    * @methodOf umbraco.services.macroService
    * @function
    *
    * @description
    * generates the syntax for inserting a macro into an mvc template
    *
    * @param {object} args an object containing the macro alias and it's parameter values
    */
  def generateMvcSyntax(args: js.Any*): Unit = js.native
  /**
    * @ngdoc function
    * @name umbraco.services.macroService#generateWebFormsSyntax
    * @methodOf umbraco.services.macroService
    * @function
    *
    * @description
    * generates the syntax for inserting a macro into a webforms templates
    *
    * @param {object} args an object containing the macro alias and it's parameter values
    */
  def generateWebFormsSyntax(args: js.Any*): Unit = js.native
}

object IMacroService {
  @scala.inline
  def apply(
    generateMacroSyntax: /* repeated */ js.Any => Unit,
    generateMvcSyntax: /* repeated */ js.Any => Unit,
    generateWebFormsSyntax: /* repeated */ js.Any => Unit
  ): IMacroService = {
    val __obj = js.Dynamic.literal(generateMacroSyntax = js.Any.fromFunction1(generateMacroSyntax), generateMvcSyntax = js.Any.fromFunction1(generateMvcSyntax), generateWebFormsSyntax = js.Any.fromFunction1(generateWebFormsSyntax))
    __obj.asInstanceOf[IMacroService]
  }
  @scala.inline
  implicit class IMacroServiceOps[Self <: IMacroService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenerateMacroSyntax(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateMacroSyntax")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGenerateMvcSyntax(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateMvcSyntax")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGenerateWebFormsSyntax(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateWebFormsSyntax")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

