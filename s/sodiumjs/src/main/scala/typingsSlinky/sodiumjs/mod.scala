package typingsSlinky.sodiumjs

import typingsSlinky.sodiumjs.lambdaMod.Lambda1_
import typingsSlinky.sodiumjs.lambdaMod.Lambda2_
import typingsSlinky.sodiumjs.lambdaMod.Lambda3_
import typingsSlinky.sodiumjs.lambdaMod.Lambda4_
import typingsSlinky.sodiumjs.lambdaMod.Lambda5_
import typingsSlinky.sodiumjs.lambdaMod.Lambda6_
import typingsSlinky.sodiumjs.vertexMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sodiumjs", "Cell")
  @js.native
  class Cell[A] protected ()
    extends typingsSlinky.sodiumjs.cellMod.Cell[A] {
    def this(initValue: A) = this()
    def this(initValue: A, str: typingsSlinky.sodiumjs.streamMod.Stream[A]) = this()
  }
  /* static members */
  object Cell {
    
    @JSImport("sodiumjs", "Cell")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sodiumjs", "Cell._liftArray")
    @js.native
    def _liftArray: js.Any = js.native
    @scala.inline
    def _liftArray_=(x: js.Any): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_liftArray")(x.asInstanceOf[js.Any])
    
    /**
      * Apply a value inside a cell to a function inside a cell. This is the
      * primitive for all function lifting.
      */
    @JSImport("sodiumjs", "Cell.apply")
    @js.native
    def apply[A, B](
      cf: typingsSlinky.sodiumjs.cellMod.Cell[js.Function1[/* a */ A, B]],
      ca: typingsSlinky.sodiumjs.cellMod.Cell[A]
    ): typingsSlinky.sodiumjs.cellMod.Cell[B] = js.native
    @JSImport("sodiumjs", "Cell.apply")
    @js.native
    def apply[A, B](
      cf: typingsSlinky.sodiumjs.cellMod.Cell[js.Function1[/* a */ A, B]],
      ca: typingsSlinky.sodiumjs.cellMod.Cell[A],
      sources: js.Array[Source]
    ): typingsSlinky.sodiumjs.cellMod.Cell[B] = js.native
    
    /**
      * Lift an array of cells into a cell of an array.
      */
    @JSImport("sodiumjs", "Cell.liftArray")
    @js.native
    def liftArray[A](ca: js.Array[typingsSlinky.sodiumjs.cellMod.Cell[A]]): typingsSlinky.sodiumjs.cellMod.Cell[js.Array[A]] = js.native
    
    /**
      * Unwrap a cell inside another cell to give a time-varying cell implementation.
      */
    @JSImport("sodiumjs", "Cell.switchC")
    @js.native
    def switchC[A](cca: typingsSlinky.sodiumjs.cellMod.Cell[typingsSlinky.sodiumjs.cellMod.Cell[A]]): typingsSlinky.sodiumjs.cellMod.Cell[A] = js.native
    
    /**
      * Unwrap a stream inside a cell to give a time-varying stream implementation.
      */
    @JSImport("sodiumjs", "Cell.switchS")
    @js.native
    def switchS[A](csa: typingsSlinky.sodiumjs.cellMod.Cell[typingsSlinky.sodiumjs.streamMod.Stream[A]]): typingsSlinky.sodiumjs.streamMod.Stream[A] = js.native
    
    /**
      * Fantasy-land Algebraic Data Type Compatability.
      * Cell satisfies the Functor, Apply, Applicative categories
      * @see {@link https://github.com/fantasyland/fantasy-land} for more info
      */
    @JSImport("sodiumjs", "Cell.fantasy-land/of")
    @js.native
    def `fantasy-landSlashof`[A](a: A): typingsSlinky.sodiumjs.cellMod.Cell[A] = js.native
  }
  
  @JSImport("sodiumjs", "CellLoop")
  @js.native
  class CellLoop[A] ()
    extends typingsSlinky.sodiumjs.cellLoopMod.CellLoop[A]
  
  @JSImport("sodiumjs", "CellSink")
  @js.native
  class CellSink[A] protected ()
    extends typingsSlinky.sodiumjs.cellSinkMod.CellSink[A] {
    /**
      * Construct a writable cell with the specified initial value. If multiple values are
      * sent in the same transaction, the specified function is used to combine them.
      *
      * If the function is not supplied, then an exception will be thrown in this case.
      */
    def this(initValue: A) = this()
    def this(initValue: A, f: js.Function2[/* l */ A, /* r */ A, A]) = this()
    def this(initValue: A, f: Lambda2_[A, A, A]) = this()
  }
  
  @JSImport("sodiumjs", "IOAction")
  @js.native
  class IOAction ()
    extends typingsSlinky.sodiumjs.ioactionMod.IOAction
  /* static members */
  object IOAction {
    
    /*!
      * Convert a function that performs asynchronous I/O taking input A
      * and returning a value of type B into an I/O action of type
      * (sa : Stream<A>) => Stream<B>
      */
    @JSImport("sodiumjs", "IOAction.fromAsync")
    @js.native
    def fromAsync[A, B](performIO: js.Function2[/* a */ A, /* result */ js.Function1[/* b */ B, scala.Unit], scala.Unit]): js.Function1[
        /* sa */ typingsSlinky.sodiumjs.streamMod.Stream[A], 
        typingsSlinky.sodiumjs.streamMod.Stream[B]
      ] = js.native
  }
  
  @JSImport("sodiumjs", "MillisecondsTimerSystem")
  @js.native
  class MillisecondsTimerSystem ()
    extends typingsSlinky.sodiumjs.millisecondsTimerSystemMod.MillisecondsTimerSystem
  
  @JSImport("sodiumjs", "Operational")
  @js.native
  class Operational ()
    extends typingsSlinky.sodiumjs.operationalMod.Operational
  /* static members */
  object Operational {
    
    /**
      * Push each event onto a new transaction guaranteed to come before the next externally
      * initiated transaction. Same as {@link split(Stream)} but it works on a single value.
      */
    @JSImport("sodiumjs", "Operational.defer")
    @js.native
    def defer[A](s: typingsSlinky.sodiumjs.streamMod.Stream[A]): typingsSlinky.sodiumjs.streamMod.Stream[A] = js.native
    
    /**
      * Push each event in the list onto a newly created transaction guaranteed
      * to come before the next externally initiated transaction. Note that the semantics
      * are such that two different invocations of split() can put events into the same
      * new transaction, so the resulting stream's events could be simultaneous with
      * events output by split() or {@link defer(Stream)} invoked elsewhere in the code.
      */
    @JSImport("sodiumjs", "Operational.split")
    @js.native
    def split[A](s: typingsSlinky.sodiumjs.streamMod.Stream[js.Array[A]]): typingsSlinky.sodiumjs.streamMod.Stream[A] = js.native
    
    /**
      * A stream that gives the updates/steps for a {@link Cell}.
      * <P>
      * This is an OPERATIONAL primitive, which is not part of the main Sodium
      * API. It breaks the property of non-detectability of cell steps/updates.
      * The rule with this primitive is that you should only use it in functions
      * that do not allow the caller to detect the cell updates.
      */
    @JSImport("sodiumjs", "Operational.updates")
    @js.native
    def updates[A](c: typingsSlinky.sodiumjs.cellMod.Cell[A]): typingsSlinky.sodiumjs.streamMod.Stream[A] = js.native
    
    /**
      * A stream that is guaranteed to fire once in the transaction where value() is invoked, giving
      * the current value of the cell, and thereafter behaves like {@link updates(Cell)},
      * firing for each update/step of the cell's value.
      * <P>
      * This is an OPERATIONAL primitive, which is not part of the main Sodium
      * API. It breaks the property of non-detectability of cell steps/updates.
      * The rule with this primitive is that you should only use it in functions
      * that do not allow the caller to detect the cell updates.
      */
    @JSImport("sodiumjs", "Operational.value")
    @js.native
    def value[A](c: typingsSlinky.sodiumjs.cellMod.Cell[A]): typingsSlinky.sodiumjs.streamMod.Stream[A] = js.native
  }
  
  @JSImport("sodiumjs", "Router")
  @js.native
  class Router[A, K] protected ()
    extends typingsSlinky.sodiumjs.routerMod.Router[A, K] {
    def this(
      inStream: typingsSlinky.sodiumjs.streamMod.Stream[A],
      selector: js.Function1[/* a */ A, js.Array[K]]
    ) = this()
    def this(
      inStream: typingsSlinky.sodiumjs.streamMod.Stream[A],
      selector: js.Function1[/* a */ A, js.Array[K]],
      keyToStr: js.Function1[/* k */ K, String]
    ) = this()
  }
  
  @JSImport("sodiumjs", "SecondsTimerSystem")
  @js.native
  class SecondsTimerSystem ()
    extends typingsSlinky.sodiumjs.secondsTimerSystemMod.SecondsTimerSystem
  
  @JSImport("sodiumjs", "Stream")
  @js.native
  class Stream[A] ()
    extends typingsSlinky.sodiumjs.streamMod.Stream[A] {
    def this(vertex: typingsSlinky.sodiumjs.vertexMod.Vertex) = this()
  }
  
  @JSImport("sodiumjs", "StreamLoop")
  @js.native
  class StreamLoop[A] ()
    extends typingsSlinky.sodiumjs.streamMod.StreamLoop[A]
  
  @JSImport("sodiumjs", "StreamSink")
  @js.native
  class StreamSink[A] ()
    extends typingsSlinky.sodiumjs.streamSinkMod.StreamSink[A] {
    def this(f: js.Function2[/* l */ A, /* r */ A, A]) = this()
    def this(f: Lambda2_[A, A, A]) = this()
  }
  
  @JSImport("sodiumjs", "TimerSystem")
  @js.native
  class TimerSystem protected ()
    extends typingsSlinky.sodiumjs.timerSystemMod.TimerSystem {
    def this(impl: typingsSlinky.sodiumjs.timerSystemMod.TimerSystemImpl) = this()
  }
  
  @JSImport("sodiumjs", "TimerSystemImpl")
  @js.native
  abstract class TimerSystemImpl ()
    extends typingsSlinky.sodiumjs.timerSystemMod.TimerSystemImpl
  
  @JSImport("sodiumjs", "Transaction")
  @js.native
  class Transaction ()
    extends typingsSlinky.sodiumjs.transactionMod.Transaction
  /* static members */
  object Transaction {
    
    @JSImport("sodiumjs", "Transaction")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sodiumjs", "Transaction._collectCyclesAtEnd")
    @js.native
    def _collectCyclesAtEnd(): scala.Unit = js.native
    
    @JSImport("sodiumjs", "Transaction.collectCyclesAtEnd")
    @js.native
    def collectCyclesAtEnd: js.Any = js.native
    @scala.inline
    def collectCyclesAtEnd_=(x: js.Any): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collectCyclesAtEnd")(x.asInstanceOf[js.Any])
    
    @JSImport("sodiumjs", "Transaction.currentTransaction")
    @js.native
    def currentTransaction: typingsSlinky.sodiumjs.transactionMod.Transaction = js.native
    @scala.inline
    def currentTransaction_=(x: typingsSlinky.sodiumjs.transactionMod.Transaction): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentTransaction")(x.asInstanceOf[js.Any])
    
    /**
      * Add a runnable that will be executed whenever a transaction is started.
      * That runnable may start transactions itself, which will not cause the
      * hooks to be run recursively.
      *
      * The main use case of this is the implementation of a time/alarm system.
      */
    @JSImport("sodiumjs", "Transaction.onStart")
    @js.native
    def onStart(r: js.Function0[scala.Unit]): scala.Unit = js.native
    
    @JSImport("sodiumjs", "Transaction.onStartHooks")
    @js.native
    def onStartHooks: js.Any = js.native
    @scala.inline
    def onStartHooks_=(x: js.Any): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStartHooks")(x.asInstanceOf[js.Any])
    
    @JSImport("sodiumjs", "Transaction.run")
    @js.native
    def run[A](f: js.Function0[A]): A = js.native
    
    @JSImport("sodiumjs", "Transaction.runningOnStartHooks")
    @js.native
    def runningOnStartHooks: js.Any = js.native
    @scala.inline
    def runningOnStartHooks_=(x: js.Any): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("runningOnStartHooks")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sodiumjs", "Tuple2")
  @js.native
  class Tuple2[A, B] protected ()
    extends typingsSlinky.sodiumjs.tuple2Mod.Tuple2[A, B] {
    def this(a: A, b: B) = this()
  }
  
  @JSImport("sodiumjs", "Unit")
  @js.native
  class Unit ()
    extends typingsSlinky.sodiumjs.unitMod.Unit
  /* static members */
  object Unit {
    
    @JSImport("sodiumjs", "Unit")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sodiumjs", "Unit.UNIT")
    @js.native
    def UNIT: typingsSlinky.sodiumjs.unitMod.Unit = js.native
    @scala.inline
    def UNIT_=(x: typingsSlinky.sodiumjs.unitMod.Unit): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sodiumjs", "Vertex")
  @js.native
  class Vertex protected ()
    extends typingsSlinky.sodiumjs.vertexMod.Vertex {
    def this(name: String, rank: Double, sources: js.Array[Source]) = this()
  }
  /* static members */
  object Vertex {
    
    @JSImport("sodiumjs", "Vertex")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sodiumjs", "Vertex.NULL")
    @js.native
    def NULL: typingsSlinky.sodiumjs.vertexMod.Vertex = js.native
    @scala.inline
    def NULL_=(x: typingsSlinky.sodiumjs.vertexMod.Vertex): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
    
    @JSImport("sodiumjs", "Vertex.collectCycles")
    @js.native
    def collectCycles(): scala.Unit = js.native
    
    @JSImport("sodiumjs", "Vertex.collectRoots")
    @js.native
    def collectRoots(): scala.Unit = js.native
    
    @JSImport("sodiumjs", "Vertex.collectingCycles")
    @js.native
    def collectingCycles: Boolean = js.native
    @scala.inline
    def collectingCycles_=(x: Boolean): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collectingCycles")(x.asInstanceOf[js.Any])
    
    @JSImport("sodiumjs", "Vertex.markRoots")
    @js.native
    def markRoots(): scala.Unit = js.native
    
    @JSImport("sodiumjs", "Vertex.scanRoots")
    @js.native
    def scanRoots(): scala.Unit = js.native
    
    @JSImport("sodiumjs", "Vertex.toBeFreedList")
    @js.native
    def toBeFreedList: js.Array[typingsSlinky.sodiumjs.vertexMod.Vertex] = js.native
    @scala.inline
    def toBeFreedList_=(x: js.Array[typingsSlinky.sodiumjs.vertexMod.Vertex]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toBeFreedList")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sodiumjs", "getTotalRegistrations")
  @js.native
  def getTotalRegistrations(): Double = js.native
  
  @JSImport("sodiumjs", "lambda1")
  @js.native
  def lambda1[A, B](
    f: js.Function1[/* a */ A, B],
    deps: js.Array[
      typingsSlinky.sodiumjs.streamMod.Stream[_] | typingsSlinky.sodiumjs.cellMod.Cell[_]
    ]
  ): Lambda1_[A, B] = js.native
  
  @JSImport("sodiumjs", "lambda2")
  @js.native
  def lambda2[A, B, C](
    f: js.Function2[/* a */ A, /* b */ B, C],
    deps: js.Array[
      typingsSlinky.sodiumjs.streamMod.Stream[_] | typingsSlinky.sodiumjs.cellMod.Cell[_]
    ]
  ): Lambda2_[A, B, C] = js.native
  
  @JSImport("sodiumjs", "lambda3")
  @js.native
  def lambda3[A, B, C, D](
    f: js.Function3[/* a */ A, /* b */ B, /* c */ C, D],
    deps: js.Array[
      typingsSlinky.sodiumjs.streamMod.Stream[_] | typingsSlinky.sodiumjs.cellMod.Cell[_]
    ]
  ): Lambda3_[A, B, C, D] = js.native
  
  @JSImport("sodiumjs", "lambda4")
  @js.native
  def lambda4[A, B, C, D, E](
    f: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, E],
    deps: js.Array[
      typingsSlinky.sodiumjs.streamMod.Stream[_] | typingsSlinky.sodiumjs.cellMod.Cell[_]
    ]
  ): Lambda4_[A, B, C, D, E] = js.native
  
  @JSImport("sodiumjs", "lambda5")
  @js.native
  def lambda5[A, B, C, D, E, F](
    f: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, F],
    deps: js.Array[
      typingsSlinky.sodiumjs.streamMod.Stream[_] | typingsSlinky.sodiumjs.cellMod.Cell[_]
    ]
  ): Lambda5_[A, B, C, D, E, F] = js.native
  
  @JSImport("sodiumjs", "lambda6")
  @js.native
  def lambda6[A, B, C, D, E, F, G](
    f: js.Function6[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, /* f */ F, G],
    deps: js.Array[
      typingsSlinky.sodiumjs.streamMod.Stream[_] | typingsSlinky.sodiumjs.cellMod.Cell[_]
    ]
  ): Lambda6_[A, B, C, D, E, F, G] = js.native
}
