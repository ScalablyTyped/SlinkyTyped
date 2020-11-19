package typingsSlinky.vitalsigns.mod

import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.NextFunction
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.vitalsigns.mod.vitalsigns.ConstraintWrapper
import typingsSlinky.vitalsigns.mod.vitalsigns.Monitor
import typingsSlinky.vitalsigns.mod.vitalsigns.MonitorField
import typingsSlinky.vitalsigns.mod.vitalsigns.ReportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * VitalSigns instance.
  */
@js.native
trait VitalSigns_ extends js.Object {
  
  /**
    * Pushes a health constraint onto this instance's constraint array.
    * Health constraints define scenarios in which VitalSigns will consider the application to be in an unhealthy state.
    * @param {} constraint A constraint.
    */
  def addConstraint(): Unit = js.native
  
  /**
    * Destroys this VitalSigns instance.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets a request handler.
    * @type {RequestHandler}
    */
  def express(req: Request[ParamsDictionary, _, _, Query], res: Response[_], next: NextFunction): js.Any = js.native
  /**
    * Gets a request handler.
    * @type {RequestHandler}
    */
  @JSName("express")
  var express_Original: RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  /**
    * Retrieves an array of human-readable messages that define the specific health constraints that failed when running the last health check.
    * @returns {Array<string>} An array of failure messages.
    */
  def getFailed(): js.Array[String] = js.native
  
  /**
    * Gets a report of all monitors, their fields, and the values of those fields, compiled into Javascript object form.  Additionally, a 'healthy' field is
    * attached. This field will be boolean true if all health constraints passed; false otherwise.
    * @param {ReportOptions} [options] A mapping of options to customize this report.
    * @return {Object} The full health report.
    */
  def getReport(): js.Object = js.native
  def getReport(options: ReportOptions): js.Object = js.native
  
  /**
    * Generates a health report and checks each health constraint against it. Any constraints that fail will be added to the 'failed' array in the form of
    * a human-readable failure message, which can be retrieved with {@link #getFailed}.
    * @param {Object} [report] A report object on which to run the health constraints. If omitted, this function will generate a health report automatically.
    * @return {boolean} true if all health constraints passed; false otherwise.
    */
  def isHealthy(): Boolean = js.native
  def isHealthy(report: js.Object): Boolean = js.native
  
  /**
    * Registers monitor.
    * @param {string} monitorName A monitor name.
    * @param {MonitorField} [field] Options.
    */
  def monitor(monitor: String): Unit = js.native
  def monitor(monitor: String, field: MonitorField): Unit = js.native
  def monitor(monitor: js.Object): Unit = js.native
  def monitor(monitor: js.Object, field: MonitorField): Unit = js.native
  def monitor(monitor: Monitor): Unit = js.native
  def monitor(monitor: Monitor, field: MonitorField): Unit = js.native
  
  /**
    * Defines a new health constraint in a chainable, more easily readable format.
    * When called with the monitor name and field name of concern, a wrapper is
    * returned that allows the constraint to be built out with function calls.
    * @param {string} monitorName A monitor name.
    * @param {string} fieldName A field name.
    * @return {ConstraintWrapper} The constraint wrapper.
    */
  def unhealthyWhen(monitorName: String, fieldName: String): ConstraintWrapper = js.native
}
