package typingsSlinky.turistFetch

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.anon.Hostname
import typingsSlinky.node.dnsMod.AnyRecord
import typingsSlinky.node.dnsMod.LookupAddress
import typingsSlinky.node.dnsMod.LookupAllOptions
import typingsSlinky.node.dnsMod.LookupOneOptions
import typingsSlinky.node.dnsMod.LookupOptions
import typingsSlinky.node.dnsMod.MxRecord
import typingsSlinky.node.dnsMod.NaptrRecord
import typingsSlinky.node.dnsMod.RecordWithTtl
import typingsSlinky.node.dnsMod.ResolveOptions
import typingsSlinky.node.dnsMod.ResolveWithTtlOptions
import typingsSlinky.node.dnsMod.Resolver
import typingsSlinky.node.dnsMod.SoaRecord
import typingsSlinky.node.dnsMod.SrvRecord
import typingsSlinky.turistFetch.turistFetchStrings.A
import typingsSlinky.turistFetch.turistFetchStrings.AAAA
import typingsSlinky.turistFetch.turistFetchStrings.ANY
import typingsSlinky.turistFetch.turistFetchStrings.CNAME
import typingsSlinky.turistFetch.turistFetchStrings.MX
import typingsSlinky.turistFetch.turistFetchStrings.NAPTR
import typingsSlinky.turistFetch.turistFetchStrings.NS
import typingsSlinky.turistFetch.turistFetchStrings.PTR
import typingsSlinky.turistFetch.turistFetchStrings.SOA
import typingsSlinky.turistFetch.turistFetchStrings.SRV
import typingsSlinky.turistFetch.turistFetchStrings.TXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Typeofdns extends StObject {
    
    // Supported getaddrinfo flags.
    val ADDRCONFIG: Double = js.native
    
    val ADDRGETNETWORKPARAMS: String = js.native
    
    /**
      * If `dns.V4MAPPED` is specified, return resolved IPv6 addresses as
      * well as IPv4 mapped IPv6 addresses.
      */
    val ALL: Double = js.native
    
    val BADFAMILY: String = js.native
    
    val BADFLAGS: String = js.native
    
    val BADHINTS: String = js.native
    
    val BADNAME: String = js.native
    
    val BADQUERY: String = js.native
    
    val BADRESP: String = js.native
    
    val BADSTR: String = js.native
    
    val CANCELLED: String = js.native
    
    val CONNREFUSED: String = js.native
    
    val DESTRUCTION: String = js.native
    
    val EOF: String = js.native
    
    val FILE: String = js.native
    
    val FORMERR: String = js.native
    
    val LOADIPHLPAPI: String = js.native
    
    // Error codes
    val NODATA: String = js.native
    
    val NOMEM: String = js.native
    
    val NONAME: String = js.native
    
    val NOTFOUND: String = js.native
    
    val NOTIMP: String = js.native
    
    val NOTINITIALIZED: String = js.native
    
    val REFUSED: String = js.native
    
    var Resolver: Instantiable0[typingsSlinky.node.dnsMod.Resolver] = js.native
    
    val SERVFAIL: String = js.native
    
    val TIMEOUT: String = js.native
    
    val V4MAPPED: Double = js.native
    
    def getServers(): js.Array[String] = js.native
    
    // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
    val lookup: Typeoflookup = js.native
    
    val lookupService: TypeoflookupService = js.native
    
    val promises: Typeofpromises = js.native
    
    // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
    val resolve: Typeofresolve = js.native
    
    // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
    val resolve4: Typeofresolve4 = js.native
    
    // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
    val resolve6: Typeofresolve6 = js.native
    
    val resolveAny: TypeofresolveAny = js.native
    
    val resolveCname: TypeofresolveCname = js.native
    
    val resolveMx: TypeofresolveMx = js.native
    
    val resolveNaptr: TypeofresolveNaptr = js.native
    
    val resolveNs: TypeofresolveNs = js.native
    
    val resolvePtr: TypeofresolvePtr = js.native
    
    val resolveSoa: TypeofresolveSoa = js.native
    
    val resolveSrv: TypeofresolveSrv = js.native
    
    val resolveTxt: TypeofresolveTxt = js.native
    
    def reverse(
      ip: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[String], Unit]
    ): Unit = js.native
    
    def setServers(servers: js.Array[String]): Unit = js.native
  }
  object Typeofdns {
    
    @scala.inline
    def apply(
      ADDRCONFIG: Double,
      ADDRGETNETWORKPARAMS: String,
      ALL: Double,
      BADFAMILY: String,
      BADFLAGS: String,
      BADHINTS: String,
      BADNAME: String,
      BADQUERY: String,
      BADRESP: String,
      BADSTR: String,
      CANCELLED: String,
      CONNREFUSED: String,
      DESTRUCTION: String,
      EOF: String,
      FILE: String,
      FORMERR: String,
      LOADIPHLPAPI: String,
      NODATA: String,
      NOMEM: String,
      NONAME: String,
      NOTFOUND: String,
      NOTIMP: String,
      NOTINITIALIZED: String,
      REFUSED: String,
      Resolver: Instantiable0[Resolver],
      SERVFAIL: String,
      TIMEOUT: String,
      V4MAPPED: Double,
      getServers: () => js.Array[String],
      lookup: Typeoflookup,
      lookupService: TypeoflookupService,
      promises: Typeofpromises,
      resolve: Typeofresolve,
      resolve4: Typeofresolve4,
      resolve6: Typeofresolve6,
      resolveAny: TypeofresolveAny,
      resolveCname: TypeofresolveCname,
      resolveMx: TypeofresolveMx,
      resolveNaptr: TypeofresolveNaptr,
      resolveNs: TypeofresolveNs,
      resolvePtr: TypeofresolvePtr,
      resolveSoa: TypeofresolveSoa,
      resolveSrv: TypeofresolveSrv,
      resolveTxt: TypeofresolveTxt,
      reverse: (String, js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[String], Unit]) => Unit,
      setServers: js.Array[String] => Unit
    ): Typeofdns = {
      val __obj = js.Dynamic.literal(ADDRCONFIG = ADDRCONFIG.asInstanceOf[js.Any], ADDRGETNETWORKPARAMS = ADDRGETNETWORKPARAMS.asInstanceOf[js.Any], ALL = ALL.asInstanceOf[js.Any], BADFAMILY = BADFAMILY.asInstanceOf[js.Any], BADFLAGS = BADFLAGS.asInstanceOf[js.Any], BADHINTS = BADHINTS.asInstanceOf[js.Any], BADNAME = BADNAME.asInstanceOf[js.Any], BADQUERY = BADQUERY.asInstanceOf[js.Any], BADRESP = BADRESP.asInstanceOf[js.Any], BADSTR = BADSTR.asInstanceOf[js.Any], CANCELLED = CANCELLED.asInstanceOf[js.Any], CONNREFUSED = CONNREFUSED.asInstanceOf[js.Any], DESTRUCTION = DESTRUCTION.asInstanceOf[js.Any], EOF = EOF.asInstanceOf[js.Any], FILE = FILE.asInstanceOf[js.Any], FORMERR = FORMERR.asInstanceOf[js.Any], LOADIPHLPAPI = LOADIPHLPAPI.asInstanceOf[js.Any], NODATA = NODATA.asInstanceOf[js.Any], NOMEM = NOMEM.asInstanceOf[js.Any], NONAME = NONAME.asInstanceOf[js.Any], NOTFOUND = NOTFOUND.asInstanceOf[js.Any], NOTIMP = NOTIMP.asInstanceOf[js.Any], NOTINITIALIZED = NOTINITIALIZED.asInstanceOf[js.Any], REFUSED = REFUSED.asInstanceOf[js.Any], Resolver = Resolver.asInstanceOf[js.Any], SERVFAIL = SERVFAIL.asInstanceOf[js.Any], TIMEOUT = TIMEOUT.asInstanceOf[js.Any], V4MAPPED = V4MAPPED.asInstanceOf[js.Any], getServers = js.Any.fromFunction0(getServers), lookup = lookup.asInstanceOf[js.Any], lookupService = lookupService.asInstanceOf[js.Any], promises = promises.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], resolve4 = resolve4.asInstanceOf[js.Any], resolve6 = resolve6.asInstanceOf[js.Any], resolveAny = resolveAny.asInstanceOf[js.Any], resolveCname = resolveCname.asInstanceOf[js.Any], resolveMx = resolveMx.asInstanceOf[js.Any], resolveNaptr = resolveNaptr.asInstanceOf[js.Any], resolveNs = resolveNs.asInstanceOf[js.Any], resolvePtr = resolvePtr.asInstanceOf[js.Any], resolveSoa = resolveSoa.asInstanceOf[js.Any], resolveSrv = resolveSrv.asInstanceOf[js.Any], resolveTxt = resolveTxt.asInstanceOf[js.Any], reverse = js.Any.fromFunction2(reverse), setServers = js.Any.fromFunction1(setServers))
      __obj.asInstanceOf[Typeofdns]
    }
    
    @scala.inline
    implicit class TypeofdnsMutableBuilder[Self <: Typeofdns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setADDRCONFIG(value: Double): Self = StObject.set(x, "ADDRCONFIG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setADDRGETNETWORKPARAMS(value: String): Self = StObject.set(x, "ADDRGETNETWORKPARAMS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setALL(value: Double): Self = StObject.set(x, "ALL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBADFAMILY(value: String): Self = StObject.set(x, "BADFAMILY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBADFLAGS(value: String): Self = StObject.set(x, "BADFLAGS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBADHINTS(value: String): Self = StObject.set(x, "BADHINTS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBADNAME(value: String): Self = StObject.set(x, "BADNAME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBADQUERY(value: String): Self = StObject.set(x, "BADQUERY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBADRESP(value: String): Self = StObject.set(x, "BADRESP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBADSTR(value: String): Self = StObject.set(x, "BADSTR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCANCELLED(value: String): Self = StObject.set(x, "CANCELLED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCONNREFUSED(value: String): Self = StObject.set(x, "CONNREFUSED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDESTRUCTION(value: String): Self = StObject.set(x, "DESTRUCTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEOF(value: String): Self = StObject.set(x, "EOF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFILE(value: String): Self = StObject.set(x, "FILE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFORMERR(value: String): Self = StObject.set(x, "FORMERR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetServers(value: () => js.Array[String]): Self = StObject.set(x, "getServers", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLOADIPHLPAPI(value: String): Self = StObject.set(x, "LOADIPHLPAPI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookup(value: Typeoflookup): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupService(value: TypeoflookupService): Self = StObject.set(x, "lookupService", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNODATA(value: String): Self = StObject.set(x, "NODATA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOMEM(value: String): Self = StObject.set(x, "NOMEM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNONAME(value: String): Self = StObject.set(x, "NONAME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOTFOUND(value: String): Self = StObject.set(x, "NOTFOUND", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOTIMP(value: String): Self = StObject.set(x, "NOTIMP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOTINITIALIZED(value: String): Self = StObject.set(x, "NOTINITIALIZED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromises(value: Typeofpromises): Self = StObject.set(x, "promises", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREFUSED(value: String): Self = StObject.set(x, "REFUSED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolve(value: Typeofresolve): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolve4(value: Typeofresolve4): Self = StObject.set(x, "resolve4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolve6(value: Typeofresolve6): Self = StObject.set(x, "resolve6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveAny(value: TypeofresolveAny): Self = StObject.set(x, "resolveAny", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveCname(value: TypeofresolveCname): Self = StObject.set(x, "resolveCname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveMx(value: TypeofresolveMx): Self = StObject.set(x, "resolveMx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveNaptr(value: TypeofresolveNaptr): Self = StObject.set(x, "resolveNaptr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveNs(value: TypeofresolveNs): Self = StObject.set(x, "resolveNs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolvePtr(value: TypeofresolvePtr): Self = StObject.set(x, "resolvePtr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveSoa(value: TypeofresolveSoa): Self = StObject.set(x, "resolveSoa", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveSrv(value: TypeofresolveSrv): Self = StObject.set(x, "resolveSrv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveTxt(value: TypeofresolveTxt): Self = StObject.set(x, "resolveTxt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolver(value: Instantiable0[Resolver]): Self = StObject.set(x, "Resolver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverse(
        value: (String, js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[String], Unit]) => Unit
      ): Self = StObject.set(x, "reverse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSERVFAIL(value: String): Self = StObject.set(x, "SERVFAIL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetServers(value: js.Array[String] => Unit): Self = StObject.set(x, "setServers", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTIMEOUT(value: String): Self = StObject.set(x, "TIMEOUT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV4MAPPED(value: Double): Self = StObject.set(x, "V4MAPPED", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeoflookup extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      family: Double,
      callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: LookupAllOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[LookupAddress], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: LookupOneOptions,
      callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: LookupOptions,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* address */ String | js.Array[LookupAddress], 
          /* family */ Double, 
          Unit
        ]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeoflookupService extends StObject {
    
    def apply(
      address: String,
      port: Double,
      callback: js.Function3[/* err */ ErrnoException | Null, /* hostname */ String, /* service */ String, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofpromises extends StObject {
    
    var Resolver: Instantiable0[typingsSlinky.node.dnsMod.promises.Resolver] = js.native
    
    def getServers(): js.Array[String] = js.native
    
    def lookup(hostname: String): js.Promise[LookupAddress] = js.native
    def lookup(hostname: String, family: Double): js.Promise[LookupAddress] = js.native
    def lookup(hostname: String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = js.native
    def lookup(hostname: String, options: LookupOneOptions): js.Promise[LookupAddress] = js.native
    def lookup(hostname: String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = js.native
    
    def lookupService(address: String, port: Double): js.Promise[Hostname] = js.native
    
    def resolve(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve(hostname: String, rrtype: String): js.Promise[
        (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
      ] = js.native
    
    def resolve4(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve4(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
    def resolve4(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
    
    def resolve6(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve6(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
    def resolve6(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
    
    def resolveAny(hostname: String): js.Promise[js.Array[AnyRecord]] = js.native
    
    def resolveCname(hostname: String): js.Promise[js.Array[String]] = js.native
    
    def resolveMx(hostname: String): js.Promise[js.Array[MxRecord]] = js.native
    
    def resolveNaptr(hostname: String): js.Promise[js.Array[NaptrRecord]] = js.native
    
    def resolveNs(hostname: String): js.Promise[js.Array[String]] = js.native
    
    def resolvePtr(hostname: String): js.Promise[js.Array[String]] = js.native
    
    def resolveSoa(hostname: String): js.Promise[SoaRecord] = js.native
    
    def resolveSrv(hostname: String): js.Promise[js.Array[SrvRecord]] = js.native
    
    def resolveTxt(hostname: String): js.Promise[js.Array[js.Array[String]]] = js.native
    
    @JSName("resolve")
    def resolve_A(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_AAAA(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_ANY(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
    @JSName("resolve")
    def resolve_CNAME(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_MX(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
    @JSName("resolve")
    def resolve_NAPTR(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
    @JSName("resolve")
    def resolve_NS(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_PTR(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
    @JSName("resolve")
    def resolve_SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
    @JSName("resolve")
    def resolve_TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
    
    def reverse(ip: String): js.Promise[js.Array[String]] = js.native
    
    def setServers(servers: js.Array[String]): Unit = js.native
  }
  
  @js.native
  trait Typeofresolve extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: String,
      callback: js.Function2[
          /* err */ ErrnoException | Null, 
          /* addresses */ (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: AAAA,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: ANY,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: A,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: CNAME,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: MX,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: NAPTR,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: NS,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: PTR,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: SOA,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ SoaRecord, Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: SRV,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: TXT,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[js.Array[String]], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofresolve4 extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: ResolveOptions,
      callback: js.Function2[
          /* err */ ErrnoException | Null, 
          /* addresses */ js.Array[RecordWithTtl | String], 
          Unit
        ]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: ResolveWithTtlOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofresolve6 extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: ResolveOptions,
      callback: js.Function2[
          /* err */ ErrnoException | Null, 
          /* addresses */ js.Array[RecordWithTtl | String], 
          Unit
        ]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: ResolveWithTtlOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolveAny extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolveCname extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolveMx extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolveNaptr extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolveNs extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolvePtr extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolveSoa extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* address */ SoaRecord, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolveSrv extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolveTxt extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[js.Array[String]], Unit]
    ): Unit = js.native
  }
}
