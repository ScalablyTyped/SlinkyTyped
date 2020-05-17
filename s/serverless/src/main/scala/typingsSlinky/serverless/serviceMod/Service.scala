package typingsSlinky.serverless.serviceMod

import typingsSlinky.serverless.anon.CompiledCloudFormationTemplate
import typingsSlinky.serverless.mod.Event
import typingsSlinky.serverless.mod.FunctionDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  var custom: Custom = js.native
  var provider: CompiledCloudFormationTemplate = js.native
  def getAllEventsInFunction(functionName: String): js.Array[Event] = js.native
  def getAllFunctions(): js.Array[String] = js.native
  def getAllFunctionsNames(): js.Array[String] = js.native
  def getEventInFunction(eventName: String, functionName: String): Event = js.native
  def getFunction(functionName: String): FunctionDefinition = js.native
  def getServiceName(): String = js.native
  def load(rawOptions: js.Object): js.Promise[_] = js.native
  def mergeResourceArrays(): Unit = js.native
  def setFunctionNames(rawOptions: js.Object): Unit = js.native
  def update(data: js.Object): js.Object = js.native
  def validate(): Service = js.native
}

object Service {
  @scala.inline
  def apply(
    custom: Custom,
    getAllEventsInFunction: String => js.Array[Event],
    getAllFunctions: () => js.Array[String],
    getAllFunctionsNames: () => js.Array[String],
    getEventInFunction: (String, String) => Event,
    getFunction: String => FunctionDefinition,
    getServiceName: () => String,
    load: js.Object => js.Promise[_],
    mergeResourceArrays: () => Unit,
    provider: CompiledCloudFormationTemplate,
    setFunctionNames: js.Object => Unit,
    update: js.Object => js.Object,
    validate: () => Service
  ): Service = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], getAllEventsInFunction = js.Any.fromFunction1(getAllEventsInFunction), getAllFunctions = js.Any.fromFunction0(getAllFunctions), getAllFunctionsNames = js.Any.fromFunction0(getAllFunctionsNames), getEventInFunction = js.Any.fromFunction2(getEventInFunction), getFunction = js.Any.fromFunction1(getFunction), getServiceName = js.Any.fromFunction0(getServiceName), load = js.Any.fromFunction1(load), mergeResourceArrays = js.Any.fromFunction0(mergeResourceArrays), provider = provider.asInstanceOf[js.Any], setFunctionNames = js.Any.fromFunction1(setFunctionNames), update = js.Any.fromFunction1(update), validate = js.Any.fromFunction0(validate))
    __obj.asInstanceOf[Service]
  }
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustom(value: Custom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAllEventsInFunction(value: String => js.Array[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllEventsInFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAllFunctions(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllFunctions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAllFunctionsNames(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllFunctionsNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEventInFunction(value: (String, String) => Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEventInFunction")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetFunction(value: String => FunctionDefinition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetServiceName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getServiceName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoad(value: js.Object => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMergeResourceArrays(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeResourceArrays")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProvider(value: CompiledCloudFormationTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFunctionNames(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFunctionNames")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: js.Object => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidate(value: () => Service): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

