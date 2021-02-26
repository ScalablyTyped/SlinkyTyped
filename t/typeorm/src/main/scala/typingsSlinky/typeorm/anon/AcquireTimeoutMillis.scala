package typingsSlinky.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AcquireTimeoutMillis extends StObject {
  
  /**
    * Max milliseconds an acquire call will wait for a resource before timing out. (default no limit), if supplied should non-zero positive integer.
    */
  val acquireTimeoutMillis: js.UndefOr[Double] = js.native
  
  /**
    * Should the pool start creating resources etc once the constructor is called, (default true)
    */
  val autostart: js.UndefOr[Double] = js.native
  
  val errorHandler: js.UndefOr[js.Function1[/* err */ js.Any, _]] = js.native
  
  /**
    * How often to run eviction checks. Default: 0 (does not run).
    */
  val evictionRunIntervalMillis: js.UndefOr[Double] = js.native
  
  /**
    * If true the oldest resources will be first to be allocated. If false the most recently released resources will
    * be the first to be allocated. This in effect turns the pool's behaviour from a queue into a stack. boolean,
    * (default true)
    */
  val fifo: js.UndefOr[Boolean] = js.native
  
  /**
    * The minimum amount of time that an object may sit idle in the pool before it is eligible for eviction due
    * to idle time. Supercedes softIdleTimeoutMillis Default: 30000
    */
  val idleTimeoutMillis: js.UndefOr[Double] = js.native
  
  /**
    * Maximum number of resources to create at any given time. (default=1)
    */
  val max: js.UndefOr[Double] = js.native
  
  /**
    * Maximum number of queued requests allowed, additional acquire calls will be callback with an err in a future
    * cycle of the event loop.
    */
  val maxWaitingClients: js.UndefOr[Double] = js.native
  
  /**
    * Minimum number of resources to keep in pool at any given time. If this is set >= max, the pool will silently
    * set the min to equal max. (default=0)
    */
  val min: js.UndefOr[Double] = js.native
  
  /**
    * Number of resources to check each eviction run. Default: 3.
    */
  val numTestsPerRun: js.UndefOr[Double] = js.native
  
  /**
    * Int between 1 and x - if set, borrowers can specify their relative priority in the queue if no resources
    * are available. see example. (default 1)
    */
  val priorityRange: js.UndefOr[Double] = js.native
  
  /**
    * Amount of time an object may sit idle in the pool before it is eligible for eviction by the idle object
    * evictor (if any), with the extra condition that at least "min idle" object instances remain in the pool.
    * Default -1 (nothing can get evicted)
    */
  val softIdleTimeoutMillis: js.UndefOr[Double] = js.native
  
  /**
    * Should the pool validate resources before giving them to clients. Requires that either factory.validate or
    * factory.validateAsync to be specified
    */
  val testOnBorrow: js.UndefOr[Boolean] = js.native
}
object AcquireTimeoutMillis {
  
  @scala.inline
  def apply(): AcquireTimeoutMillis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcquireTimeoutMillis]
  }
  
  @scala.inline
  implicit class AcquireTimeoutMillisMutableBuilder[Self <: AcquireTimeoutMillis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcquireTimeoutMillis(value: Double): Self = StObject.set(x, "acquireTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcquireTimeoutMillisUndefined: Self = StObject.set(x, "acquireTimeoutMillis", js.undefined)
    
    @scala.inline
    def setAutostart(value: Double): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutostartUndefined: Self = StObject.set(x, "autostart", js.undefined)
    
    @scala.inline
    def setErrorHandler(value: /* err */ js.Any => _): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    @scala.inline
    def setEvictionRunIntervalMillis(value: Double): Self = StObject.set(x, "evictionRunIntervalMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvictionRunIntervalMillisUndefined: Self = StObject.set(x, "evictionRunIntervalMillis", js.undefined)
    
    @scala.inline
    def setFifo(value: Boolean): Self = StObject.set(x, "fifo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFifoUndefined: Self = StObject.set(x, "fifo", js.undefined)
    
    @scala.inline
    def setIdleTimeoutMillis(value: Double): Self = StObject.set(x, "idleTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleTimeoutMillisUndefined: Self = StObject.set(x, "idleTimeoutMillis", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMaxWaitingClients(value: Double): Self = StObject.set(x, "maxWaitingClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWaitingClientsUndefined: Self = StObject.set(x, "maxWaitingClients", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setNumTestsPerRun(value: Double): Self = StObject.set(x, "numTestsPerRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTestsPerRunUndefined: Self = StObject.set(x, "numTestsPerRun", js.undefined)
    
    @scala.inline
    def setPriorityRange(value: Double): Self = StObject.set(x, "priorityRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityRangeUndefined: Self = StObject.set(x, "priorityRange", js.undefined)
    
    @scala.inline
    def setSoftIdleTimeoutMillis(value: Double): Self = StObject.set(x, "softIdleTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftIdleTimeoutMillisUndefined: Self = StObject.set(x, "softIdleTimeoutMillis", js.undefined)
    
    @scala.inline
    def setTestOnBorrow(value: Boolean): Self = StObject.set(x, "testOnBorrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestOnBorrowUndefined: Self = StObject.set(x, "testOnBorrow", js.undefined)
  }
}
