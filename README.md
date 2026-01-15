# Fire

**Firewall Android sans root** - Contrôlez l'accès réseau de vos applications

Fire est un firewall Android qui utilise l'API VpnService pour intercepter et filtrer le trafic réseau sans nécessiter de root. Inspiré de [NetGuard](https://github.com/M66B/NetGuard).

## Fonctionnalités

### Firewall par application
- Bloquez l'accès internet pour des applications spécifiques
- Règles séparées pour WiFi et données mobiles
- Planification horaire (ex: bloquer une app uniquement la nuit)

### Bloqueur de publicités
- Interception des requêtes DNS (port 53)
- Filtrage basé sur des listes de blocage (format hosts)
- Blocage des domaines publicitaires et trackers

### Moniteur réseau
- Visualisation des connexions en temps réel
- Historique des destinations (IP/domaines) par application
- Statistiques de consommation data par application

### Règles personnalisées
- Blocage de domaines spécifiques
- Blocage de plages IP
- Whitelist/Blacklist par application

## Principe technique

Fire crée un VPN local sur l'appareil qui intercepte tout le trafic réseau sortant. Cela permet de :
- Identifier quelle application émet chaque paquet
- Filtrer les connexions selon les règles définies
- Bloquer les requêtes DNS vers des domaines indésirables

Aucun trafic ne quitte l'appareil via un serveur externe - tout le filtrage se fait localement.

## Applications similaires

| Caractéristique | NetGuard | Fire | Blokada | AdGuard |
|-----------------|----------|------|---------|---------|
| VPN local (sans root) | ✓ | ✓ | ✓ | ✓ |
| Firewall par app | ✓ | ✓ | - | ✓ |
| Blocage DNS (ads) | ✓ | ✓ | ✓ | ✓ |
| Monitoring réseau | ✓ | ✓ | - | ✓ |
| Règles WiFi/Mobile | ✓ | ✓ | - | ✓ |

## Licence

À définir

## Contribution

Les contributions sont les bienvenues ! N'hésitez pas à ouvrir une issue ou une pull request.
