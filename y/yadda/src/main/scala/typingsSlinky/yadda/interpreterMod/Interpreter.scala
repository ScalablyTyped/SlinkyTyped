package typingsSlinky.yadda.interpreterMod

import typingsSlinky.yadda.libMod.Scenario
import typingsSlinky.yadda.libMod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interpreter extends js.Object {
  
  def interpret(scenario: js.Array[Scenario], scenario_context: typingsSlinky.yadda.contextMod.^): Unit = js.native
  def interpret(
    scenario: js.Array[Scenario],
    scenario_context: typingsSlinky.yadda.contextMod.^,
    next: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Scenario], Unit]
  ): Unit = js.native
  def interpret(scenario: Scenario, scenario_context: typingsSlinky.yadda.contextMod.^): Unit = js.native
  def interpret(
    scenario: Scenario,
    scenario_context: typingsSlinky.yadda.contextMod.^,
    next: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Scenario], Unit]
  ): Unit = js.native
  
  def interpret_step(step: js.Array[Step], scenario_context: typingsSlinky.yadda.contextMod.^): Unit = js.native
  def interpret_step(
    step: js.Array[Step],
    scenario_context: typingsSlinky.yadda.contextMod.^,
    next: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Step], Unit]
  ): Unit = js.native
  def interpret_step(step: Step, scenario_context: typingsSlinky.yadda.contextMod.^): Unit = js.native
  def interpret_step(
    step: Step,
    scenario_context: typingsSlinky.yadda.contextMod.^,
    next: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Step], Unit]
  ): Unit = js.native
  
  def requires(libs: js.Array[typingsSlinky.yadda.libraryMod.^]): this.type = js.native
  def requires(libs: typingsSlinky.yadda.libraryMod.^): this.type = js.native
  
  def validate(scenario: Scenario): Unit = js.native
}
