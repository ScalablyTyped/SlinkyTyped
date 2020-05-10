package typingsSlinky.umbraco.umbraco.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.macroResource
  * @description Deals with data for macros
  *
  **/
@js.native
trait IMacroResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.macroResource#getMacroParameters
    * @methodOf umbraco.resources.macroResource
    *
    * @description
    * Gets the editable macro parameters for the specified macro alias
    *
    * @param {int} macroId The macro id to get parameters for
    *
    */
  def getMacroParameters(macroId: Double): js.Any = js.native
  /**
    * @ngdoc method
    * @name umbraco.resources.macroResource#getMacroResult
    * @methodOf umbraco.resources.macroResource
    *
    * @description
    * Gets the result of a macro as html to display in the rich text editor
    *
    * @param {int} macroId The macro id to get parameters for
    * @param {int} pageId The current page id
    * @param {Array} macroParamDictionary A dictionary of macro parameters
    *
    */
  def getMacroResultAsHtmlForEditor(macroId: Double, pageId: Double, macroParamDictionary: js.Array[_]): js.Any = js.native
}

object IMacroResource {
  @scala.inline
  def apply(
    getMacroParameters: Double => js.Any,
    getMacroResultAsHtmlForEditor: (Double, Double, js.Array[_]) => js.Any
  ): IMacroResource = {
    val __obj = js.Dynamic.literal(getMacroParameters = js.Any.fromFunction1(getMacroParameters), getMacroResultAsHtmlForEditor = js.Any.fromFunction3(getMacroResultAsHtmlForEditor))
    __obj.asInstanceOf[IMacroResource]
  }
  @scala.inline
  implicit class IMacroResourceOps[Self <: IMacroResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMacroParameters(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMacroParameters")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetMacroResultAsHtmlForEditor(value: (Double, Double, js.Array[_]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMacroResultAsHtmlForEditor")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

