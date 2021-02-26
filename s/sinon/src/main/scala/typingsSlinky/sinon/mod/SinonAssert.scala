package typingsSlinky.sinon.mod

import typingsSlinky.sinon.anon.PartialSinonExposeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonAssert extends StObject {
  
  /**
    * Passes if spy was always called with obj as its this value.
    */
  def alwaysCalledOn(spy: SinonSpy[_, _], obj: js.Any): Unit = js.native
  
  /**
    * Passes if spy was always called with the provided arguments.
    * @param spy
    * @param args
    */
  def alwaysCalledWith[TArgs /* <: js.Array[_] */](
    spy: SinonSpy[TArgs, _],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Unit = js.native
  
  /**
    * Passes if spy was always called with the provided arguments and no others.
    */
  def alwaysCalledWithExactly[TArgs /* <: js.Array[_] */](
    spy: SinonSpy[TArgs, _],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Unit = js.native
  
  /**
    * Passes if spy was always called with matching arguments.
    * This behaves the same way as sinon.assert.alwaysCalledWith(spy, sinon.match(arg1), sinon.match(arg2), ...).
    */
  def alwaysCalledWithMatch[TArgs /* <: js.Array[_] */](
    spy: SinonSpy[TArgs, _],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Unit = js.native
  
  /**
    * Like threw, only required for all calls to the spy.
    */
  def alwaysThrew(spy: SinonSpy[_, _]): Unit = js.native
  /**
    * Like threw, only required for all calls to the spy.
    */
  def alwaysThrew(spy: SinonSpy[_, _], exception: String): Unit = js.native
  /**
    * Like threw, only required for all calls to the spy.
    */
  def alwaysThrew(spy: SinonSpy[_, _], exception: js.Any): Unit = js.native
  
  /**
    * Passes if spy was called exactly num times.
    */
  def callCount(spy: SinonSpy[_, _], count: Double): Unit = js.native
  
  /**
    * Passes if provided spies were called in the specified order.
    * @param spies
    */
  def callOrder(spies: (SinonSpy[_, _])*): Unit = js.native
  
  /**
    * Passes if spy was called at least once.
    */
  def called(spy: SinonSpy[_, _]): Unit = js.native
  
  def calledOn(spyOrSpyCall: SinonSpyCall[_, _], obj: js.Any): Unit = js.native
  /**
    * Passes if spy was ever called with obj as its this value.
    * It’s possible to assert on a dedicated spy call: sinon.assert.calledOn(spy.firstCall, arg1, arg2, ...);.
    */
  def calledOn(spyOrSpyCall: SinonSpy[_, _], obj: js.Any): Unit = js.native
  
  /**
    * Passes if spy was called once and only once.
    */
  def calledOnce(spy: SinonSpy[_, _]): Unit = js.native
  
  def calledOnceWithExactly[TArgs /* <: js.Array[_] */](
    spyOrSpyCall: SinonSpyCall[TArgs, _],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Unit = js.native
  /**
    * Passes if spy was called at exactly once with the provided arguments and no others.
    * @param spyOrSpyCall
    * @param args
    */
  def calledOnceWithExactly[TArgs /* <: js.Array[_] */](
    spyOrSpyCall: SinonSpy[TArgs, _],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Unit = js.native
  
  def calledOnceWithMatch[TArgs /* <: js.Array[_] */](
    spyOrSpyCall: SinonSpyCall[TArgs, _],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Unit = js.native
  /**
    * Passes if spy was called once with matching arguments.
    * This behaves the same way as calling both sinon.assert.calledOnce(spy) and
    * sinon.assert.calledWithMatch(spy, ...).
    */
  def calledOnceWithMatch[TArgs /* <: js.Array[_] */](
    spyOrSpyCall: SinonSpy[TArgs, _],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Unit = js.native
  
  /**
    * Passes if spy was called exactly three times.
    */
  def calledThrice(spy: SinonSpy[_, _]): Unit = js.native
  
  /**
    * Passes if spy was called exactly twice.
    */
  def calledTwice(spy: SinonSpy[_, _]): Unit = js.native
  
  def calledWith[TArgs /* <: js.Array[_] */](
    spyOrSpyCall: SinonSpyCall[TArgs, _],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Unit = js.native
  /**
    * Passes if spy was called with the provided arguments.
    * It’s possible to assert on a dedicated spy call: sinon.assert.calledWith(spy.firstCall, arg1, arg2, ...);.
    * @param spyOrSpyCall
    * @param args
    */
  def calledWith[TArgs /* <: js.Array[_] */](
    spyOrSpyCall: SinonSpy[TArgs, _],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Unit = js.native
  
  def calledWithExactly[TArgs /* <: js.Array[_] */](
    spyOrSpyCall: SinonSpyCall[TArgs, _],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Unit = js.native
  /**
    * Passes if spy was called with the provided arguments and no others.
    * It’s possible to assert on a dedicated spy call: sinon.assert.calledWithExactly(spy.getCall(1), arg1, arg2, ...);.
    * @param spyOrSpyCall
    * @param args
    */
  def calledWithExactly[TArgs /* <: js.Array[_] */](
    spyOrSpyCall: SinonSpy[TArgs, _],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Unit = js.native
  
  def calledWithMatch[TArgs /* <: js.Array[_] */](
    spyOrSpyCall: SinonSpyCall[TArgs, _],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Unit = js.native
  /**
    * Passes if spy was called with matching arguments.
    * This behaves the same way as sinon.assert.calledWith(spy, sinon.match(arg1), sinon.match(arg2), ...).
    * It's possible to assert on a dedicated spy call: sinon.assert.calledWithMatch(spy.secondCall, arg1, arg2, ...);.
    */
  def calledWithMatch[TArgs /* <: js.Array[_] */](
    spyOrSpyCall: SinonSpy[TArgs, _],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Unit = js.native
  
  /**
    * Passes if spy was called with the new operator.
    * It’s possible to assert on a dedicated spy call: sinon.assert.calledWithNew(spy.secondCall, arg1, arg2, ...);.
    * @param spyOrSpyCall
    */
  def calledWithNew(spyOrSpyCall: SinonSpy[_, _]): Unit = js.native
  def calledWithNew(spyOrSpyCall: SinonSpyCall[_, _]): Unit = js.native
  
  /**
    * Exposes assertions into another object, to better integrate with the test framework.
    * For instance, JsTestDriver uses global assertions, and to make Sinon.JS assertions appear alongside them, you can do.
    * @example sinon.assert.expose(this);
    * This will give you assertCalled(spy),assertCallOrder(spy1, spy2, ...) and so on.
    * The method accepts an optional options object with two options.
    */
  def expose(obj: js.Any): Unit = js.native
  def expose(obj: js.Any, options: PartialSinonExposeOptions): Unit = js.native
  
  /**
    * Every assertion fails by calling this method.
    * By default it throws an error of type sinon.assert.failException.
    * If the test framework looks for assertion errors by checking for a specific exception, you can simply override the kind of exception thrown.
    * If that does not fit with your testing framework of choice, override the fail method to do the right thing.
    */
  def fail(): Unit = js.native
  def fail(message: String): Unit = js.native
  
  // Properties
  /**
    * Defaults to AssertError.
    */
  var failException: String = js.native
  
  /**
    * Uses sinon.match to test if the arguments can be considered a match.
    */
  def `match`(actual: js.Any, expected: js.Any): Unit = js.native
  
  /**
    * Passes if spy was never called with the provided arguments.
    * @param spy
    * @param args
    */
  def neverCalledWith[TArgs /* <: js.Array[_] */](
    spy: SinonSpy[TArgs, _],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type MatchArguments<TArgs> is not an array type */ args: MatchArguments[TArgs]
  ): Unit = js.native
  
  /**
    * Passes if spy was never called with matching arguments.
    * This behaves the same way as sinon.assert.neverCalledWith(spy, sinon.match(arg1), sinon.match(arg2), ...).
    * @param spy
    * @param args
    */
  def neverCalledWithMatch[TArgs /* <: js.Array[_] */](
    spy: SinonSpy[TArgs, _],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
  ): Unit = js.native
  
  // Overridable
  // Methods
  /**
    * Passes if spy was never called
    * @param spy
    */
  def notCalled(spy: SinonSpy[_, _]): Unit = js.native
  
  // Overridable
  /**
    * Called every time assertion passes.
    * Default implementation does nothing.
    */
  def pass(assertion: js.Any): Unit = js.native
  
  /**
    * Passes if spy threw any exception.
    */
  def threw(spyOrSpyCall: SinonSpy[_, _]): Unit = js.native
  def threw(spyOrSpyCall: SinonSpyCall[_, _]): Unit = js.native
  def threw(spyOrSpyCall: SinonSpyCall[_, _], exception: String): Unit = js.native
  def threw(spyOrSpyCall: SinonSpyCall[_, _], exception: js.Any): Unit = js.native
  /**
    * Passes if spy threw the given exception.
    * The exception is an actual object.
    * It’s possible to assert on a dedicated spy call: sinon.assert.threw(spy.thirdCall, exception);.
    */
  def threw(spyOrSpyCall: SinonSpy[_, _], exception: String): Unit = js.native
  /**
    * Passes if spy threw the given exception.
    * The exception is a String denoting its type.
    * It’s possible to assert on a dedicated spy call: sinon.assert.threw(spy.thirdCall, exception);.
    */
  def threw(spyOrSpyCall: SinonSpy[_, _], exception: js.Any): Unit = js.native
}
