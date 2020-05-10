package typingsSlinky.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowBrowserExecution extends js.Object {
  /**
    * If true will enable execution of plugins on the server.
    *   config.plugin.allowBrowserExecution = true;
    */
  var allowBrowserExecution: Boolean = js.native
  /**
    * If true will enable execution of plugins on 
    * the server.config.plugin.allowServerExecution = false;
    */
  var allowServerExecution: Boolean = js.native
  /**
    * Same as for `config.addOns.basePath' 
    * [TODO: link to AddOns] but for plugins instead.
    *   config.plugin.basePaths = ['./src/plugin/coreplugins']
    */
  var basePaths: js.Array[String] = js.native
  /**
    * If true there is no need to register plugins on the 
    * root-node of project - all will be available from the drop-down.
    *   config.plugin.displayAll = false;
    */
  var displayAll: Boolean = js.native
  /**
    * Time, in milliseconds, results will be stored on 
    * the server after they have finished (when invoked via the REST api).
    *   config.plugin.serverResultTimeout = 60000;
    */
  var serverResultTimeout: Double = js.native
}

object AnonAllowBrowserExecution {
  @scala.inline
  def apply(
    allowBrowserExecution: Boolean,
    allowServerExecution: Boolean,
    basePaths: js.Array[String],
    displayAll: Boolean,
    serverResultTimeout: Double
  ): AnonAllowBrowserExecution = {
    val __obj = js.Dynamic.literal(allowBrowserExecution = allowBrowserExecution.asInstanceOf[js.Any], allowServerExecution = allowServerExecution.asInstanceOf[js.Any], basePaths = basePaths.asInstanceOf[js.Any], displayAll = displayAll.asInstanceOf[js.Any], serverResultTimeout = serverResultTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowBrowserExecution]
  }
  @scala.inline
  implicit class AnonAllowBrowserExecutionOps[Self <: AnonAllowBrowserExecution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowBrowserExecution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowBrowserExecution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowServerExecution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowServerExecution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasePaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerResultTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverResultTimeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

