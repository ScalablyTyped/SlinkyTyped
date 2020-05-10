package typingsSlinky.solutionCenterCommunicator.ScCommunicator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScEnvironmentsProvider extends js.Object {
  /**
    * Access to the public methods of the service
    */
  @JSName("$get")
  def $get(): js.Any = js.native
  /**
    * Get current environment
    * If environment was not previously configured, use default environment
    *
    * @public
    * @returns {Object} Current or default environment
    */
  def getCurrentEnvironment(): Environment = js.native
  /**
    * Get specific environment
    *
    * @public
    * @param {string} name - Environment name
    * @returns {Object} Specific or default environment
    */
  def getSpecificEnvironment(name: String): Environment = js.native
  /**
    * Set current environment
    *
    * @public
    * @param {string|Object} env - Environment name or custom environment object
    * @returns {Object} Named or custom environment
    */
  def setCurrentEnvironment(env: js.Any): Environment = js.native
}

object ScEnvironmentsProvider {
  @scala.inline
  def apply(
    $get: () => js.Any,
    getCurrentEnvironment: () => Environment,
    getSpecificEnvironment: String => Environment,
    setCurrentEnvironment: js.Any => Environment
  ): ScEnvironmentsProvider = {
    val __obj = js.Dynamic.literal($get = js.Any.fromFunction0($get), getCurrentEnvironment = js.Any.fromFunction0(getCurrentEnvironment), getSpecificEnvironment = js.Any.fromFunction1(getSpecificEnvironment), setCurrentEnvironment = js.Any.fromFunction1(setCurrentEnvironment))
    __obj.asInstanceOf[ScEnvironmentsProvider]
  }
  @scala.inline
  implicit class ScEnvironmentsProviderOps[Self <: ScEnvironmentsProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$get(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$get")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentEnvironment(value: () => Environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentEnvironment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSpecificEnvironment(value: String => Environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSpecificEnvironment")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCurrentEnvironment(value: js.Any => Environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCurrentEnvironment")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

