package typingsSlinky.solutionCenterCommunicator.ScCommunicator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environments extends js.Object {
  /**
    * Development environment
    */
  var DEVELOPMENT: Environment = js.native
  /**
    * Integration environment
    */
  var INTEGRATION: Environment = js.native
  /**
    * Local environment
    */
  var LOCAL: Environment = js.native
  /**
    * Production environment
    */
  var PRODUCTION: Environment = js.native
  /**
    * Stage environment
    */
  var STAGE: Environment = js.native
  /**
    * Testing environment
    */
  var TESTING: Environment = js.native
}

object Environments {
  @scala.inline
  def apply(
    DEVELOPMENT: Environment,
    INTEGRATION: Environment,
    LOCAL: Environment,
    PRODUCTION: Environment,
    STAGE: Environment,
    TESTING: Environment
  ): Environments = {
    val __obj = js.Dynamic.literal(DEVELOPMENT = DEVELOPMENT.asInstanceOf[js.Any], INTEGRATION = INTEGRATION.asInstanceOf[js.Any], LOCAL = LOCAL.asInstanceOf[js.Any], PRODUCTION = PRODUCTION.asInstanceOf[js.Any], STAGE = STAGE.asInstanceOf[js.Any], TESTING = TESTING.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environments]
  }
  @scala.inline
  implicit class EnvironmentsOps[Self <: Environments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDEVELOPMENT(value: Environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DEVELOPMENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINTEGRATION(value: Environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INTEGRATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLOCAL(value: Environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOCAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPRODUCTION(value: Environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PRODUCTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTAGE(value: Environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTESTING(value: Environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TESTING")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

