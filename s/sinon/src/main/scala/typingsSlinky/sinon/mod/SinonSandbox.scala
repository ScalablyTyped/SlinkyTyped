package typingsSlinky.sinon.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.sinon.anon.Get
import typingsSlinky.sinon.anon.PartialSinonFakeTimersCon
import typingsSlinky.sinon.sinonStrings.get
import typingsSlinky.sinon.sinonStrings.set
import typingsSlinky.std.Parameters
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonSandbox extends js.Object {
  
  /**
    * A convenience reference for sinon.assert
    * Since sinon@2.0.0
    */
  var assert: SinonAssert = js.native
  
  var clock: SinonFakeTimers = js.native
  
  /**
    * Creates a new object with the given functions as the prototype and stubs all implemented functions.
    *
    * @template TType Type being stubbed.
    * @param constructor   Object or class to stub.
    * @param overrides     An optional map overriding created stubs
    * @returns A stubbed version of the constructor.
    * @remarks The given constructor function is not invoked. See also the stub API.
    */
  def createStubInstance[TType](constructor: StubbableType[TType]): SinonStubbedInstance[TType] = js.native
  def createStubInstance[TType](
    constructor: StubbableType[TType],
    overrides: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TType ]:? sinon.sinon.SinonStubbedMember<TType[K]> | TType[K] extends (args : ...any): infer R? any : TType[K]}
    */ typingsSlinky.sinon.sinonStrings.SinonSandbox with TopLevel[js.Any]
  ): SinonStubbedInstance[TType] = js.native
  
  /**
    * Works exactly like sinon.mock
    */
  def mock(): SinonExpectation = js.native
  /**
    * Creates a mock for the provided object.
    * Does not change the object, but returns a mock object to set expectations on the object’s methods.
    */
  /**
    * Works exactly like sinon.mock
    */
  def mock(obj: js.Any): SinonMock = js.native
  /**
    * Works exactly like sinon.mock
    */
  @JSName("mock")
  var mock_Original: SinonMockStatic = js.native
  
  /**
    * Replaces property on object with replacement argument. Attempts to replace an already replaced value cause an exception.
    * replacement can be any value, including spies, stubs and fakes.
    * This method only works on non-accessor properties, for replacing accessors, use sandbox.replaceGetter() and sandbox.replaceSetter().
    */
  def replace[T, TKey /* <: /* keyof T */ String */](
    obj: T,
    prop: TKey,
    replacement: /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any = js.native
  
  /**
    * Replaces getter for property on object with replacement argument. Attempts to replace an already replaced getter cause an exception.
    * replacement must be a Function, and can be instances of spies, stubs and fakes.
    * @param obj
    * @param prop
    * @param replacement
    */
  def replaceGetter[T, TKey /* <: /* keyof T */ String */](
    obj: T,
    prop: TKey,
    replacement: js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
    ]
  ): js.Function0[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ js.Any
  ] = js.native
  
  /**
    * Replaces setter for property on object with replacement argument. Attempts to replace an already replaced setter cause an exception.
    * replacement must be a Function, and can be instances of spies, stubs and fakes.
    * @param obj
    * @param prop
    * @param replacement
    */
  def replaceSetter[T, TKey /* <: /* keyof T */ String */](
    obj: T,
    prop: TKey,
    replacement: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ /* val */ js.Any, 
      Unit
    ]
  ): js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: T[TKey] */ /* val */ js.Any, 
    Unit
  ] = js.native
  
  var requests: js.Array[SinonFakeXMLHttpRequest] = js.native
  
  /**
    * Resets the internal state of all fakes created through sandbox.
    */
  def reset(): Unit = js.native
  
  /**
    * Resets the behaviour of all stubs created through the sandbox.
    * Since sinon@2.0.0
    */
  def resetBehavior(): Unit = js.native
  
  /**
    * Resets the history of all stubs created through the sandbox.
    * Since sinon@2.0.0
    */
  def resetHistory(): Unit = js.native
  
  /**
    * Restores all fakes created through sandbox.
    */
  def restore(): Unit = js.native
  
  var server: SinonFakeServer = js.native
  
  /**
    * Creates an anonymous function that records arguments, this value, exceptions and return values for all calls.
    */
  /**
    * Works exactly like sinon.spy
    */
  def spy(): SinonSpy[js.Array[_], _] = js.native
  /**
    * Spies on the provided function
    */
  /**
    * Works exactly like sinon.spy
    */
  def spy[F /* <: js.Function1[/* repeated */ js.Any, _] */](func: F): SinonSpy[Parameters[F], ReturnType[F]] = js.native
  /**
    * Creates a spy for object.method and replaces the original method with the spy.
    * An exception is thrown if the property is not already a function.
    * The spy acts exactly like the original method in all cases.
    * The original method can be restored by calling object.method.restore().
    * The returned spy is the function object which replaced the original method. spy === object.method.
    */
  /**
    * Works exactly like sinon.spy
    */
  def spy[T, K /* <: /* keyof T */ String */](obj: T, method: K): SinonSpy[_ | js.Array[_], _] = js.native
  /**
    * Works exactly like sinon.spy
    */
  def spy[T, K /* <: /* keyof T */ String */](obj: T, method: K, types: js.Array[get | set]): js.PropertyDescriptor with (Get[T, K]) = js.native
  /**
    * Works exactly like sinon.spy
    */
  @JSName("spy")
  var spy_Original: SinonSpyStatic = js.native
  
  /* tslint:enable:no-unnecessary-generics */
  /**
    * Stubs all the object’s methods.
    * Note that it’s usually better practice to stub individual methods, particularly on objects that you don’t understand or control all the methods for (e.g. library dependencies).
    * Stubbing individual methods tests intent more precisely and is less susceptible to unexpected behavior as the object’s code evolves.
    * If you want to create a stub object of MyConstructor, but don’t want the constructor to be invoked, use this utility function.
    */
  /**
    * Works exactly like sinon.stub.
    */
  def stub[T](obj: T): SinonStubbedInstance[T] = js.native
  /* tslint:disable:no-unnecessary-generics */
  /**
    * Creates an anonymous stub function
    */
  /**
    * Works exactly like sinon.stub.
    */
  def stub[TArgs /* <: js.Array[_] */, R](): SinonStub[TArgs, R] = js.native
  /**
    * Replaces obj.method with a stub function.
    * An exception is thrown if the property is not already a function.
    * The original function can be restored by calling object.method.restore(); (or stub.restore();).
    */
  /**
    * Works exactly like sinon.stub.
    */
  def stub[T, K /* <: /* keyof T */ String */](obj: T, method: K): SinonStub[_ | js.Array[_], _] = js.native
  /**
    * Works exactly like sinon.stub.
    */
  @JSName("stub")
  var stub_Original: SinonStubStatic = js.native
  
  /**
    * Fakes XHR and binds a server object to the sandbox such that it too is restored when calling sandbox.restore().
    * Access requests through sandbox.requests and server through sandbox.server
    */
  def useFakeServer(): SinonFakeServer = js.native
  
  /**
    * * No param : Causes Sinon to replace the global setTimeout, clearTimeout, setInterval, clearInterval, setImmediate, clearImmediate, process.hrtime, performance.now(when available)
    * and Date with a custom implementation which is bound to the returned clock object.
    * Starts the clock at the UNIX epoch (timestamp of 0).
    * * Now : As above, but rather than starting the clock with a timestamp of 0, start at the provided timestamp now.
    * Since sinon@2.0.0
    * You can also pass in a Date object, and its getTime() will be used for the starting timestamp.
    * * Config : As above, but allows further configuration options, some of which are:
    * * config.now - Number/Date - installs lolex with the specified unix epoch (default: 0)
    * * config.toFake - String[ ] - an array with explicit function names to fake.
    * By default lolex will automatically fake all methods except process.nextTick. You could, however, still fake nextTick by providing it explicitly
    * * config.shouldAdvanceTime - Boolean - tells lolex to increment mocked time automatically based on the real system time shift (default: false)
    * * Please visit the lolex.install documentation for the full feature set.
    * * Important note: when faking nextTick, normal calls to process.nextTick() would not execute automatically as they would during normal event-loop phases.
    * You would have to call either clock.next(), clock.tick(), clock.runAll() or clock.runToLast() (see example below). Please refer to the lolex documentation for more information.
    * @param config
    */
  def useFakeTimers(): SinonFakeTimers = js.native
  def useFakeTimers(config: Double): SinonFakeTimers = js.native
  def useFakeTimers(config: PartialSinonFakeTimersCon): SinonFakeTimers = js.native
  def useFakeTimers(config: js.Date): SinonFakeTimers = js.native
  
  /**
    * Causes Sinon to replace the native XMLHttpRequest object in browsers that support it with a custom implementation which does not send actual requests.
    * In browsers that support ActiveXObject, this constructor is replaced, and fake objects are returned for XMLHTTP progIds.
    * Other progIds, such as XMLDOM are left untouched.
    * The native XMLHttpRequest object will be available at sinon.xhr.XMLHttpRequest
    */
  def useFakeXMLHttpRequest(): SinonFakeXMLHttpRequestStatic = js.native
  
  /**
    * Causes all stubs created from the sandbox to return promises using a specific Promise library instead of the global one when using stub.rejects or stub.resolves.
    * Returns the stub to allow chaining.
    * Since sinon@2.0.0
    */
  def usingPromise(promiseLibrary: js.Any): SinonSandbox = js.native
  
  /**
    * Verifies all mocks created through the sandbox.
    */
  def verify(): Unit = js.native
  
  /**
    * Verifies all mocks and restores all fakes created through the sandbox.
    */
  def verifyAndRestore(): Unit = js.native
}
