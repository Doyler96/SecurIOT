 $ip =([ipaddress] (Get-NetIPAddress -InterfaceAlias Wi-Fi -AddressFamily IPv4).IPAddress).GetAddressBytes()[0..2] -join "."
 


 $statement = "List of Ip addresses attached to Wi-Fi Network"
 $statement

 $look = arp -a | findstr $ip 


 Write-Output "$look" >> discovered.txt
<#

 $Cont = "c"
 
 while (($Cont -ne "q") -or ($Cont -ne "Q")) {
  $myHost = read-host "Please enter valid ip address to check: "
  
  Resolve-DnsName $myHost;

  $Cont = read-host " press q to quit c to continue"
#>
} 
   
 